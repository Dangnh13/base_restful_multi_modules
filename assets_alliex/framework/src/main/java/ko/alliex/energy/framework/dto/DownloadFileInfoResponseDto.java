package ko.alliex.energy.framework.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;

import java.io.IOException;
import java.io.Serializable;
import java.util.Optional;

@Data
@Builder
@Slf4j
public class DownloadFileInfoResponseDto implements Serializable {
    private static final long serialVersionUID = -5191720900504650800L;

    private String contentType;
    private Long contentLength;
    private byte[] content;

    private String fileName;

    public static Optional<DownloadFileInfoResponseDto> from(ResponseInputStream<GetObjectResponse> objectResponseResponseInputStream) throws IOException {
        if (objectResponseResponseInputStream != null && objectResponseResponseInputStream.response() != null) {
            log.info("Content-Type: {}", objectResponseResponseInputStream.response().contentType());
            log.info("Content length: {}", objectResponseResponseInputStream.response().contentLength());
            return Optional.ofNullable(DownloadFileInfoResponseDto.builder()
                    .contentType(objectResponseResponseInputStream.response().contentType())
                    .contentLength(objectResponseResponseInputStream.response().contentLength())
                    .content(objectResponseResponseInputStream.readAllBytes())
                    .build());
        }
        log.info("No data file");
        return Optional.empty();
    }
}
