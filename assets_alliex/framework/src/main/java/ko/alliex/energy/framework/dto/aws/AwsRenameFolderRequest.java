package ko.alliex.energy.framework.dto.aws;

import ko.alliex.energy.framework.dto.AwsFileInfoRequestDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AwsRenameFolderRequest extends AwsFileInfoRequestDto {
    private String bucketName;
    private String oldFolderKey;
    private String newFolderKey;
}
