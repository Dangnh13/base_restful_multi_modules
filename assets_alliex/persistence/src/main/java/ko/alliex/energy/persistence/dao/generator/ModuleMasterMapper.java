package ko.alliex.energy.persistence.dao.generator;

import java.util.List;
import ko.alliex.energy.domain.entity.generator.ModuleMaster;
import ko.alliex.energy.domain.entity.generator.ModuleMasterCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ModuleMasterMapper {
    long countByExample(ModuleMasterCriteria example);

    int deleteByExample(ModuleMasterCriteria example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(ModuleMaster record);

    int insertSelective(ModuleMaster record);

    List<ModuleMaster> selectByExampleWithRowbounds(ModuleMasterCriteria example, RowBounds rowBounds);

    ModuleMaster selectOneByExample(ModuleMasterCriteria example);

    List<ModuleMaster> selectByExample(ModuleMasterCriteria example);

    ModuleMaster selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") ModuleMaster record, @Param("example") ModuleMasterCriteria example);

    int updateByExample(@Param("record") ModuleMaster record, @Param("example") ModuleMasterCriteria example);

    int updateByPrimaryKeySelective(ModuleMaster record);

    int updateByPrimaryKey(ModuleMaster record);

    int batchInsert(@Param("list") List<ModuleMaster> list);

    int batchInsertSelective(@Param("list") List<ModuleMaster> list, @Param("selective") ModuleMaster.Column ... selective);

    int upsert(ModuleMaster record);

    int upsertSelective(ModuleMaster record);
}