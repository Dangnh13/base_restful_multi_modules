package ko.alliex.energy.business.service.impl;

import ko.alliex.energy.business.service.UserService;
import ko.alliex.energy.persistence.dao.custom.CustomUserMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import ko.alliex.energy.dto.user.rst.UserDetailRst;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final CustomUserMapper userMapper;

    @Override
    public UserDetailRst getUserDetail(String email) {
        return userMapper.getUserDetailsByEmail(email);
    }
}
