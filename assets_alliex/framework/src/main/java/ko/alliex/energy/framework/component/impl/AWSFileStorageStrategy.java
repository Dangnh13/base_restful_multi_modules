package ko.alliex.energy.framework.component.impl;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.transfer.MultipleFileUpload;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerBuilder;
import com.amazonaws.services.s3.transfer.Upload;
import ko.alliex.energy.framework.component.FileStorage;
import ko.alliex.energy.framework.constant.CommonConstant;
import ko.alliex.energy.framework.dto.DeleteFileListRequest;
import ko.alliex.energy.framework.dto.DownloadFileInfoResponseDto;
import ko.alliex.energy.framework.dto.FileInfoRequestDto;
import ko.alliex.energy.framework.dto.UploadFileListRequest;
import ko.alliex.energy.framework.dto.aws.AwsCreateFolderRequest;
import ko.alliex.energy.framework.dto.aws.AwsDeleteFileListRequest;
import ko.alliex.energy.framework.dto.aws.AwsDeleteFolderRequest;
import ko.alliex.energy.framework.dto.aws.AwsDownloadFileInfoRequest;
import ko.alliex.energy.framework.dto.aws.AwsDownloadStreamingFileInfoRequest;
import ko.alliex.energy.framework.dto.aws.AwsRenameFolderRequest;
import ko.alliex.energy.framework.dto.aws.AwsUploadFileInfoRequest;
import ko.alliex.energy.framework.exception.model.ErrorCode;
import ko.alliex.energy.framework.exception.type.NoDataFoundException;
import ko.alliex.energy.framework.exception.type.ServiceException;
import ko.alliex.energy.framework.util.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.http.apache.ApacheHttpClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.CopyObjectRequest;
import software.amazon.awssdk.services.s3.model.Delete;
import software.amazon.awssdk.services.s3.model.DeleteObjectRequest;
import software.amazon.awssdk.services.s3.model.DeleteObjectsRequest;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;
import software.amazon.awssdk.services.s3.model.ListObjectsRequest;
import software.amazon.awssdk.services.s3.model.ListObjectsResponse;
import software.amazon.awssdk.services.s3.model.NoSuchKeyException;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectResponse;
import software.amazon.awssdk.services.s3.model.S3Object;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executors;

@Slf4j
public class AWSFileStorageStrategy implements FileStorage {

    private static final long THRESHOLD = 5 * 1024 * 1025;

    private static final String WEB_FOLDER = "web/";

    private static final String WEB_POW_PLANT_FOLDER = WEB_FOLDER + "pow_plant/";

    private final AwsCredentials awsCredentials;

    private final String bucketName;

    public AWSFileStorageStrategy(AwsCredentials awsCredentials,
                                  String bucketName) {
        this.awsCredentials = awsCredentials;
        this.bucketName = bucketName;
    }

    @Override
    public boolean uploadFile(File fileUpload, String s3ObjectKey) throws InterruptedException {
        boolean result;
        final int threadPoolSize = Runtime.getRuntime().availableProcessors() + 1;
        TransferManager tm = TransferManagerBuilder.standard()
                .withS3Client(buildAmazonS3Client())
                .withMultipartUploadThreshold(THRESHOLD)
                .withExecutorFactory(() -> Executors.newFixedThreadPool(threadPoolSize))
                .build();
        try {
            // TransferManager processes all transfers asynchronously, so this call returns immediately.
            Upload upload = tm.upload(bucketName, WEB_FOLDER + s3ObjectKey, fileUpload);
            upload.waitForCompletion();
            log.info("File upload complete");
        } catch (AmazonServiceException e) {
            log.error(e.getErrorMessage());
            throw e;
        }
        tm.shutdownNow();
        return true;
    }

    @Override
    public String upload(FileInfoRequestDto fileInfo) {
        AwsUploadFileInfoRequest awsRequest = (AwsUploadFileInfoRequest) fileInfo;
        S3Client s3 = buildS3Client();
        String bucket = defaultValueOfBucketName(awsRequest.getBucketName());
        String entityTag = putS3Object(s3,
                bucket,
                WEB_FOLDER + awsRequest.getObjectKey(),
                awsRequest.getDataFile());
        log.info("Tag information: " + entityTag);
        s3.close();
        return entityTag;
    }

    @Override
    public Optional<DownloadFileInfoResponseDto> download(FileInfoRequestDto fileInfo) {
        AwsDownloadFileInfoRequest awsRequest = (AwsDownloadFileInfoRequest) fileInfo;
        S3Client s3Client = buildS3Client();
        String bucket = defaultValueOfBucketName(awsRequest.getBucketName());
        try {
            ResponseInputStream<GetObjectResponse> objectResponseResponseInputStream = s3Client.getObject(
                    GetObjectRequest.builder().bucket(bucket)
                            .key(WEB_FOLDER + awsRequest.getObjectKey())
                            .build()
            );
            return DownloadFileInfoResponseDto.from(objectResponseResponseInputStream);
        } catch (NoSuchKeyException e) {
            throw new NoDataFoundException(ErrorCode.ES3NDFKEY.getErrorMessage(), ErrorCode.ES3NDFKEY.getErrorCode());
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR, "Download file error: " + e.getMessage());
        }
    }

    @Override
    public Optional<String> createFolder(FileInfoRequestDto fileInfoDto) {
        AwsCreateFolderRequest awsRequest = (AwsCreateFolderRequest) fileInfoDto;
        S3Client s3 = buildS3Client();
        String bucket = defaultValueOfBucketName(awsRequest.getBucketName());
        String entityTag;
        try {
            entityTag = putS3Object(s3,
                    bucket,
                    WEB_POW_PLANT_FOLDER + awsRequest.getFolderKey() + CommonConstant.SYMBOL.SLASH_SYMBOL,
                    FileUtil.getDateEmptyFolder());
        } catch (IOException e) {
            log.error(e.getMessage());
            throw new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR, "Create folder S3 error: " + e.getMessage());
        } finally {
            s3.close();
        }
        log.info("Tag information: " + entityTag);
        return Optional.ofNullable(entityTag);
    }

    @Override
    public Optional<String> renameFolder(FileInfoRequestDto fileInfoDto) {
        AwsRenameFolderRequest awsRequest = (AwsRenameFolderRequest) fileInfoDto;
        S3Client s3 = buildS3Client();
        String bucket = defaultValueOfBucketName(awsRequest.getBucketName());
        try {
            String oldFolder = String.format("%s%s%s", WEB_POW_PLANT_FOLDER, awsRequest.getOldFolderKey(), CommonConstant.SYMBOL.SLASH_SYMBOL);
            String newFolder = String.format("%s%s%s", WEB_POW_PLANT_FOLDER, awsRequest.getNewFolderKey(), CommonConstant.SYMBOL.SLASH_SYMBOL);
            CopyObjectRequest copyObjectRequest = CopyObjectRequest.builder()
                    .copySource(bucket + "/" + oldFolder)
                    .bucket(bucket)
                    .key(newFolder)
                    .build();
            s3.copyObject(copyObjectRequest);
            deleteFolder(AwsDeleteFolderRequest.builder().folderKey(awsRequest.getOldFolderKey()).build());
        } finally {
            s3.close();
        }
        return Optional.empty();
    }

    @Override
    public Optional<String> deleteFolder(FileInfoRequestDto fileInfoDto) {
        AwsDeleteFolderRequest awsRequest = (AwsDeleteFolderRequest) fileInfoDto;
        S3Client s3 = buildS3Client();
        String bucket = defaultValueOfBucketName(awsRequest.getBucketName());
        try {
            String folderPath = String.format("%s%s%s", WEB_POW_PLANT_FOLDER, awsRequest.getFolderKey(), CommonConstant.SYMBOL.SLASH_SYMBOL);
            ListObjectsRequest listObjectsRequest = ListObjectsRequest.builder()
                    .bucket(bucket)
                    .prefix(folderPath)
                    .build();
            ListObjectsResponse listObjectsResponse = s3.listObjects(listObjectsRequest);
            if (listObjectsResponse != null && CollectionUtils.isNotEmpty(listObjectsResponse.contents())) {
                for (S3Object s3Object : listObjectsResponse.contents()) {
                    s3.deleteObject(DeleteObjectRequest.builder().bucket(bucket).key(s3Object.key()).build());
                }
            }
        } finally {
            s3.close();
        }
        return Optional.empty();
    }

    @Override
    public Optional<Void> uploadFileList(UploadFileListRequest request) {
        final int threadPoolSize = 3;
        TransferManager tm = TransferManagerBuilder.standard()
                .withS3Client(buildAmazonS3Client())
                .withMultipartUploadThreshold(THRESHOLD)
                .withExecutorFactory(() -> Executors.newFixedThreadPool(threadPoolSize))
                .build();
        try {
            List<File> listFileUpload = request.getFiles();
            File directory = (request.getDirectory() != null) ? request.getDirectory() : new File(CommonConstant.SYMBOL.DOT_SYMBOL);
            MultipleFileUpload xfer = tm.uploadFileList(
                    defaultValueOfBucketName(request.getBucketName()), WEB_POW_PLANT_FOLDER, directory, listFileUpload);
            xfer.waitForCompletion();
        } catch (AmazonServiceException e) {
            log.error(e.getErrorMessage());
            throwExceptionWhenUploadFileFailed();
        } catch (InterruptedException e) {
            log.error(e.getMessage());
            throwExceptionWhenUploadFileFailed();
        }
        tm.shutdownNow();
        return Optional.empty();
    }

    @Override
    public Optional<Void> deleteFileList(DeleteFileListRequest request) {
        AwsDeleteFileListRequest awsRequest = (AwsDeleteFileListRequest) request;
        S3Client s3 = buildS3Client();
        String bucket = defaultValueOfBucketName(awsRequest.getBucketName());
        try {
            DeleteObjectsRequest objectsRequest = DeleteObjectsRequest.builder()
                    .bucket(bucket)
                    .delete(Delete.builder().objects(awsRequest.getListObjectIdentifiers(WEB_POW_PLANT_FOLDER)).build())
                    .build();
            s3.deleteObjects(objectsRequest);
        } finally {
            s3.close();
        }
        return Optional.empty();
    }

    @Override
    public ResponseInputStream<GetObjectResponse> downloadStreaming(FileInfoRequestDto fileInfoDto) {
        AwsDownloadStreamingFileInfoRequest awsRequest = (AwsDownloadStreamingFileInfoRequest) fileInfoDto;
        S3Client s3Client = buildS3Client();
        String bucket = defaultValueOfBucketName(awsRequest.getBucketName());
        try {
            return s3Client.getObject(
                    GetObjectRequest.builder().bucket(bucket)
                            .key(awsRequest.getObjectKey())
                            .build()
            );
        } catch (NoSuchKeyException e) {
            throw new NoDataFoundException(ErrorCode.ES3NDFKEY.getErrorMessage(), ErrorCode.ES3NDFKEY.getErrorCode());
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR, "Download file error: " + e.getMessage());
        }
    }

    private String putS3Object(S3Client s3,
                               String bucketName,
                               String objectKey,
                               byte[] file) {
        PutObjectResponse response = s3.putObject(PutObjectRequest.builder()
                        .bucket(bucketName)
                        .key(objectKey)
                        .build(),
                RequestBody.fromBytes(file));
        return response.eTag();
    }

    private S3Client buildS3Client() {
        Region region = Region.AP_NORTHEAST_1;

        return S3Client.builder()
                .region(region)
                .credentialsProvider(StaticCredentialsProvider.create(this.awsCredentials))
                .httpClient(
                        ApacheHttpClient.builder()
                                .build()
                )
                .build();
    }

    private AmazonS3 buildAmazonS3Client() {
        AWSCredentials credentials = new BasicAWSCredentials(
                this.awsCredentials.accessKeyId(),
                this.awsCredentials.secretAccessKey()
        );
        return AmazonS3ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.AP_NORTHEAST_1)
                .build();
    }

    private String defaultValueOfBucketName(String _bucketName) {
        return StringUtils.defaultString(_bucketName, this.bucketName);
    }

    private void throwExceptionWhenUploadFileFailed() {
        throw new ServiceException(HttpStatus.INTERNAL_SERVER_ERROR, "Upload file failed!");
    }
}
