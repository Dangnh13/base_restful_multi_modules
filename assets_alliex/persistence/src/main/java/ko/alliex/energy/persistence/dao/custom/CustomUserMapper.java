package ko.alliex.energy.persistence.dao.custom;

import ko.alliex.energy.persistence.dao.generator.UsersMapper;
import org.apache.ibatis.annotations.Mapper;
import ko.alliex.energy.dto.user.rst.UserDetailRst;

@Mapper
public interface CustomUserMapper extends UsersMapper {
    UserDetailRst getUserDetailsByEmail(String email);

}
