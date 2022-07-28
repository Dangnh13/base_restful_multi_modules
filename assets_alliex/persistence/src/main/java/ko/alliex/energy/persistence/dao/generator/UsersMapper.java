package ko.alliex.energy.persistence.dao.generator;

import java.util.List;
import ko.alliex.energy.domain.entity.generator.Users;
import ko.alliex.energy.domain.entity.generator.UsersCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UsersMapper {
    long countByExample(UsersCriteria example);

    int deleteByExample(UsersCriteria example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExampleWithRowbounds(UsersCriteria example, RowBounds rowBounds);

    Users selectOneByExample(UsersCriteria example);

    List<Users> selectByExample(UsersCriteria example);

    Users selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersCriteria example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersCriteria example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    int batchInsert(@Param("list") List<Users> list);

    int batchInsertSelective(@Param("list") List<Users> list, @Param("selective") Users.Column ... selective);

    int upsert(Users record);

    int upsertSelective(Users record);
}