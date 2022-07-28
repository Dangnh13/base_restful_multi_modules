package ko.alliex.energy.framework.security.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Data
@NoArgsConstructor
public class UserGrantedAuthority implements GrantedAuthority {

    private static final String ROLE_ID = "role";
    private static final String ROLE_NAME = "roleName";
    private static final String FUNC_AUTHORITY = "func";

    private String password;

    @Getter
    @JsonProperty(ROLE_ID)
    private String managementAuthority;

    @Getter
    @JsonProperty(ROLE_NAME)
    private String managementAuthorityName;

    @JsonProperty(FUNC_AUTHORITY)
    private List<FuncAuthority> funcAuthoritySet;

    @Override
    @JsonIgnore
    public String getAuthority() {
        return this.managementAuthority;
    }

    @JsonCreator
    public UserGrantedAuthority(final String managementAuthority,
                                final List<FuncAuthority> authoritySet,
                                String password) {
        this.managementAuthority = managementAuthority;
        this.funcAuthoritySet = authoritySet;
        this.password = password;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }
}
