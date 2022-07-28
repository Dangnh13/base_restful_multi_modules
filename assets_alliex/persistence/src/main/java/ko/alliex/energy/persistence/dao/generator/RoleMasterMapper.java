package ko.alliex.energy.persistence.dao.generator;

import java.util.List;
import ko.alliex.energy.domain.entity.generator.RoleMaster;
import ko.alliex.energy.domain.entity.generator.RoleMasterCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface RoleMasterMapper {
    long countByExample(RoleMasterCriteria example);

    int deleteByExample(RoleMasterCriteria example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(RoleMaster record);

    int insertSelective(RoleMaster record);

    List<RoleMaster> selectByExampleWithRowbounds(RoleMasterCriteria example, RowBounds rowBounds);

    RoleMaster selectOneByExample(RoleMasterCriteria example);

    List<RoleMaster> selectByExample(RoleMasterCriteria example);

    RoleMaster selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") RoleMaster record, @Param("example") RoleMasterCriteria example);

    int updateByExample(@Param("record") RoleMaster record, @Param("example") RoleMasterCriteria example);

    int updateByPrimaryKeySelective(RoleMaster record);

    int updateByPrimaryKey(RoleMaster record);

    int batchInsert(@Param("list") List<RoleMaster> list);

    int batchInsertSelective(@Param("list") List<RoleMaster> list, @Param("selective") RoleMaster.Column ... selective);

    int upsert(RoleMaster record);

    int upsertSelective(RoleMaster record);
}