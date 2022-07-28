package ko.alliex.energy.jwt.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;

    @JsonProperty("access_token")
    private final String accessToken;

    public JwtResponse(String accessToken) {
        this.accessToken = accessToken;
    }

}