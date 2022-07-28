package ko.alliex.energy.persistence.dao.generator;

import java.util.List;
import ko.alliex.energy.domain.entity.generator.ModuleRole;
import ko.alliex.energy.domain.entity.generator.ModuleRoleCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ModuleRoleMapper {
    long countByExample(ModuleRoleCriteria example);

    int deleteByExample(ModuleRoleCriteria example);

    int deleteByPrimaryKey(Integer moduleRoleId);

    int insert(ModuleRole record);

    int insertSelective(ModuleRole record);

    List<ModuleRole> selectByExampleWithRowbounds(ModuleRoleCriteria example, RowBounds rowBounds);

    ModuleRole selectOneByExample(ModuleRoleCriteria example);

    List<ModuleRole> selectByExample(ModuleRoleCriteria example);

    ModuleRole selectByPrimaryKey(Integer moduleRoleId);

    int updateByExampleSelective(@Param("record") ModuleRole record, @Param("example") ModuleRoleCriteria example);

    int updateByExample(@Param("record") ModuleRole record, @Param("example") ModuleRoleCriteria example);

    int updateByPrimaryKeySelective(ModuleRole record);

    int updateByPrimaryKey(ModuleRole record);

    int batchInsert(@Param("list") List<ModuleRole> list);

    int batchInsertSelective(@Param("list") List<ModuleRole> list, @Param("selective") ModuleRole.Column ... selective);

    int upsert(ModuleRole record);

    int upsertSelective(ModuleRole record);
}