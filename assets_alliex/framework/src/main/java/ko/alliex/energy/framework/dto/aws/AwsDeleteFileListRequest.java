package ko.alliex.energy.framework.dto.aws;

import ko.alliex.energy.framework.dto.DeleteFileListRequest;
import lombok.Builder;
import lombok.Data;
import software.amazon.awssdk.services.s3.model.ObjectIdentifier;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class AwsDeleteFileListRequest extends DeleteFileListRequest {
    private String bucketName;
    private List<String> keys;

    public List<ObjectIdentifier> getListObjectIdentifiers(String awsFolder) {
        return keys.stream().map(e ->
                ObjectIdentifier.builder().key(awsFolder + e).build()
        ).collect(Collectors.toList());
    }
}
