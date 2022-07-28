package ko.alliex.energy.business.service;

import ko.alliex.energy.dto.user.rst.UserDetailRst;

public interface UserService {
    UserDetailRst getUserDetail(String email);
}
