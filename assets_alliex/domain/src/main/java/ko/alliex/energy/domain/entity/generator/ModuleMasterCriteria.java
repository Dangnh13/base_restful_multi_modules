package ko.alliex.energy.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModuleMasterCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModuleMasterCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public ModuleMasterCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ModuleMasterCriteria orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        ModuleMasterCriteria example = new ModuleMasterCriteria();
        return example.createCriteria();
    }

    public ModuleMasterCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ModuleMasterCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierIsNull() {
            addCriterion("module_identifier is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierIsNotNull() {
            addCriterion("module_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierEqualTo(String value) {
            addCriterion("module_identifier =", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierNotEqualTo(String value) {
            addCriterion("module_identifier <>", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierNotEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierGreaterThan(String value) {
            addCriterion("module_identifier >", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierGreaterThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("module_identifier >=", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierGreaterThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLessThan(String value) {
            addCriterion("module_identifier <", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLessThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLessThanOrEqualTo(String value) {
            addCriterion("module_identifier <=", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLessThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLike(String value) {
            addCriterion("module_identifier like", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierNotLike(String value) {
            addCriterion("module_identifier not like", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierIn(List<String> values) {
            addCriterion("module_identifier in", values, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierNotIn(List<String> values) {
            addCriterion("module_identifier not in", values, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierBetween(String value1, String value2) {
            addCriterion("module_identifier between", value1, value2, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierNotBetween(String value1, String value2) {
            addCriterion("module_identifier not between", value1, value2, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("module_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Short value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Short value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Short value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Short value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Short value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Short> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Short> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Short value1, Short value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Short value1, Short value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreatedUidIsNull() {
            addCriterion("created_uid is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUidIsNotNull() {
            addCriterion("created_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUidEqualTo(Integer value) {
            addCriterion("created_uid =", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidNotEqualTo(Integer value) {
            addCriterion("created_uid <>", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidNotEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThan(Integer value) {
            addCriterion("created_uid >", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_uid >=", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThan(Integer value) {
            addCriterion("created_uid <", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanOrEqualTo(Integer value) {
            addCriterion("created_uid <=", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidIn(List<Integer> values) {
            addCriterion("created_uid in", values, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidNotIn(List<Integer> values) {
            addCriterion("created_uid not in", values, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidBetween(Integer value1, Integer value2) {
            addCriterion("created_uid between", value1, value2, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidNotBetween(Integer value1, Integer value2) {
            addCriterion("created_uid not between", value1, value2, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("created_at <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidIsNull() {
            addCriterion("updated_uid is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidIsNotNull() {
            addCriterion("updated_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidEqualTo(Integer value) {
            addCriterion("updated_uid =", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidNotEqualTo(Integer value) {
            addCriterion("updated_uid <>", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidNotEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThan(Integer value) {
            addCriterion("updated_uid >", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_uid >=", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThan(Integer value) {
            addCriterion("updated_uid <", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanOrEqualTo(Integer value) {
            addCriterion("updated_uid <=", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidIn(List<Integer> values) {
            addCriterion("updated_uid in", values, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidNotIn(List<Integer> values) {
            addCriterion("updated_uid not in", values, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidBetween(Integer value1, Integer value2) {
            addCriterion("updated_uid between", value1, value2, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_uid not between", value1, value2, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualToColumn(ModuleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLikeInsensitive(String value) {
            addCriterion("upper(module_identifier) like", value.toUpperCase(), "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleNameLikeInsensitive(String value) {
            addCriterion("upper(module_name) like", value.toUpperCase(), "moduleName");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ModuleMasterCriteria example;

        protected Criteria(ModuleMasterCriteria example) {
            super();
            this.example = example;
        }

        public ModuleMasterCriteria example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(ko.alliex.energy.domain.entity.generator.ModuleMasterCriteria example);
    }
}