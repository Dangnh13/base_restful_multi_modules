package ko.alliex.energy.framework.dto.aws;

import ko.alliex.energy.framework.dto.AwsFileInfoRequestDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AwsDeleteFolderRequest extends AwsFileInfoRequestDto {
    private String bucketName;
    private String folderKey;
}
