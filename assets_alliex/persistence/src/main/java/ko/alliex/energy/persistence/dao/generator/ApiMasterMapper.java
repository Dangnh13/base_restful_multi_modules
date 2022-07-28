package ko.alliex.energy.persistence.dao.generator;

import java.util.List;
import ko.alliex.energy.domain.entity.generator.ApiMaster;
import ko.alliex.energy.domain.entity.generator.ApiMasterCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ApiMasterMapper {
    long countByExample(ApiMasterCriteria example);

    int deleteByExample(ApiMasterCriteria example);

    int deleteByPrimaryKey(Integer apiId);

    int insert(ApiMaster record);

    int insertSelective(ApiMaster record);

    List<ApiMaster> selectByExampleWithRowbounds(ApiMasterCriteria example, RowBounds rowBounds);

    ApiMaster selectOneByExample(ApiMasterCriteria example);

    List<ApiMaster> selectByExample(ApiMasterCriteria example);

    ApiMaster selectByPrimaryKey(Integer apiId);

    int updateByExampleSelective(@Param("record") ApiMaster record, @Param("example") ApiMasterCriteria example);

    int updateByExample(@Param("record") ApiMaster record, @Param("example") ApiMasterCriteria example);

    int updateByPrimaryKeySelective(ApiMaster record);

    int updateByPrimaryKey(ApiMaster record);

    int batchInsert(@Param("list") List<ApiMaster> list);

    int batchInsertSelective(@Param("list") List<ApiMaster> list, @Param("selective") ApiMaster.Column ... selective);

    int upsert(ApiMaster record);

    int upsertSelective(ApiMaster record);
}