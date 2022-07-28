package ko.alliex.energy.jwt.dto.request;

import ko.alliex.energy.framework.validation.annotation.RequiredNotBlank;
import ko.alliex.energy.jwt.dto.dxo.LoginDxo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    @RequiredNotBlank
    private String email;

    @RequiredNotBlank
    private String password;

    public JwtRequest(String email, String password) {
        this.setEmail(email);
        this.setPassword(password);
    }

    public LoginDxo toDxo() {
        return LoginDxo.builder()
                .email(this.email)
                .password(this.password)
                .build();
    }
}
