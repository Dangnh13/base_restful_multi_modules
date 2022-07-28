package ko.alliex.energy.jwt.service;

import ko.alliex.energy.business.service.UserService;
import ko.alliex.energy.dto.user.rst.UserDetailRst;
import ko.alliex.energy.framework.security.model.FuncAuthority;
import ko.alliex.energy.framework.security.model.FuncItem;
import ko.alliex.energy.framework.security.model.LoginInfo;
import ko.alliex.energy.framework.security.model.UserGrantedAuthority;
import ko.alliex.energy.framework.util.BeanUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@Data
@AllArgsConstructor
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserDetailRst userDetailRst = userService.getUserDetail(email);
        if (userDetailRst == null) {
            throw new UsernameNotFoundException("User not found!");
        }

        UserGrantedAuthority userGrantedAuthority = new UserGrantedAuthority();
        userGrantedAuthority.setPassword(userDetailRst.getPassword());
        userGrantedAuthority.setManagementAuthority(StringUtils.defaultString(userDetailRst.getRoleIdentifier()));
        userGrantedAuthority.setManagementAuthorityName(StringUtils.defaultString(userDetailRst.getRoleName()));
        if (CollectionUtils.isNotEmpty(userDetailRst.getModuleDetails())) {
            userGrantedAuthority.setFuncAuthoritySet(
                    userDetailRst.getModuleDetails().stream()
                            .map(e -> {
                                FuncAuthority authority = new FuncAuthority();
                                BeanUtil.copyProperties(e, authority);
                                if (CollectionUtils.isNotEmpty(e.getApiMasters())) {
                                    authority.setFuncItems(
                                            e.getApiMasters().stream()
                                                    .map(api -> {
                                                        FuncItem functionItem = new FuncItem();
                                                        BeanUtil.copyProperties(api, functionItem);
                                                        return functionItem;
                                                    }).collect(Collectors.toList()));
                                }
                                return authority;
                            }).collect(Collectors.toList()));
        }

        return new LoginInfo(userDetailRst.getUserId(),
                userDetailRst.getEmail(),
                userGrantedAuthority);
    }

}
