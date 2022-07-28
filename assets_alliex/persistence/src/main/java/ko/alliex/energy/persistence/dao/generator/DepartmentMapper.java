package ko.alliex.energy.persistence.dao.generator;

import java.util.List;
import ko.alliex.energy.domain.entity.generator.Department;
import ko.alliex.energy.domain.entity.generator.DepartmentCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface DepartmentMapper {
    long countByExample(DepartmentCriteria example);

    int deleteByExample(DepartmentCriteria example);

    int deleteByPrimaryKey(Integer departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExampleWithRowbounds(DepartmentCriteria example, RowBounds rowBounds);

    Department selectOneByExample(DepartmentCriteria example);

    List<Department> selectByExample(DepartmentCriteria example);

    Department selectByPrimaryKey(Integer departmentId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentCriteria example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentCriteria example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    int batchInsert(@Param("list") List<Department> list);

    int batchInsertSelective(@Param("list") List<Department> list, @Param("selective") Department.Column ... selective);

    int upsert(Department record);

    int upsertSelective(Department record);
}