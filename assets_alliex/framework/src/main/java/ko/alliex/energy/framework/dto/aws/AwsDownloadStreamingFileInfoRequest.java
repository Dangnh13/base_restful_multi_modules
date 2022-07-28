package ko.alliex.energy.framework.dto.aws;

import ko.alliex.energy.framework.dto.AwsFileInfoRequestDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AwsDownloadStreamingFileInfoRequest extends AwsFileInfoRequestDto {
    private String bucketName;
    private String objectKey;
}
