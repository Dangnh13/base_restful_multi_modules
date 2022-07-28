package ko.alliex.energy.framework.dto;

import lombok.Data;

@Data
public class AwsFileInfoRequestDto extends FileInfoRequestDto {
    private String bucketName;
}
