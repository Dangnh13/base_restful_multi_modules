package ko.alliex.energy.framework.dto.aws;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AwsMailInfoRequest {
    private String from;
    private String fromName;
    private String to;
    private String subject;
    private String body;
    private String configset;
    private String smtpUserName;
    private String smtpPassword;
}
