package ko.alliex.energy.framework.component;

import ko.alliex.energy.framework.dto.DeleteFileListRequest;
import ko.alliex.energy.framework.dto.DownloadFileInfoResponseDto;
import ko.alliex.energy.framework.dto.FileInfoRequestDto;
import ko.alliex.energy.framework.dto.UploadFileListRequest;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public interface FileStorage {

    boolean uploadFile(File fileUpload, String s3ObjectKey) throws InterruptedException;

    String upload(FileInfoRequestDto fileInfo);

    Optional<DownloadFileInfoResponseDto> download(FileInfoRequestDto fileInfoDto) throws IOException;

    Optional<String> createFolder(FileInfoRequestDto fileInfoDto);

    Optional<String> renameFolder(FileInfoRequestDto fileInfoDto);

    Optional<String> deleteFolder(FileInfoRequestDto fileInfoDto);

    Optional<Void> uploadFileList(UploadFileListRequest request);

    Optional<Void> deleteFileList(DeleteFileListRequest request);

    ResponseInputStream<GetObjectResponse> downloadStreaming(FileInfoRequestDto fileInfoDto);
}
