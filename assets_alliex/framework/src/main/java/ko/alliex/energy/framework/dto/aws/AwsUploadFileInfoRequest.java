package ko.alliex.energy.framework.dto.aws;

import ko.alliex.energy.framework.dto.AwsFileInfoRequestDto;
import lombok.Data;

@Data
public class AwsUploadFileInfoRequest extends AwsFileInfoRequestDto {
    private String bucketName;
    private String objectKey;
    private byte[] dataFile;
}
