package ko.alliex.energy.framework.security.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ko.alliex.energy.framework.constant.CommonConstant;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public final class LoginInfo implements UserDetails {

    private Integer userId;

    private String email;

    private UserGrantedAuthority userGrantedAuthority;

    public LoginInfo(Integer userId,
                     String email,
                     UserGrantedAuthority userGrantedAuthority) {
        this.userId = userId;
        this.email = email;
        this.userGrantedAuthority = userGrantedAuthority;
    }

    public static LoginInfo fromContext() {
        if (SecurityContextHolder.getContext() == null
                || SecurityContextHolder.getContext().getAuthentication() == null
                || SecurityContextHolder.getContext().getAuthentication().getPrincipal() == null) {
            return null;
        }
        Object authentication = SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();

        return (authentication instanceof LoginInfo) ? (LoginInfo) authentication : null;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(this.userGrantedAuthority);
    }

    @Override
    @JsonIgnore
    public String getPassword() {
        return this.userGrantedAuthority.getPassword();
    }

    public Map<String, Object> toClaimSet() {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CommonConstant.TOKEN.USER_CLAIM_SET.UID, this.userId);
        // TODO claims.put("userAuthorityInfo", this.userGrantedAuthority);
        return claims;
    }

    public boolean hasRoleIn(List<String> roleIds) {
        return roleIds.contains(this.userGrantedAuthority.getManagementAuthority());
    }
}
