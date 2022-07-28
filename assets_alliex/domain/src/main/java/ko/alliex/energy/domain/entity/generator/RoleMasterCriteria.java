package ko.alliex.energy.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleMasterCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleMasterCriteria() {
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

    public RoleMasterCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public RoleMasterCriteria orderBy(String ... orderByClauses) {
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
        RoleMasterCriteria example = new RoleMasterCriteria();
        return example.createCriteria();
    }

    public RoleMasterCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public RoleMasterCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
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

        public Criteria andIsDeletedEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Short value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Short value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Short value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Short value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualToColumn(RoleMaster.Column column) {
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

        public Criteria andCreatedUidEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidNotEqualTo(Integer value) {
            addCriterion("created_uid <>", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidNotEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThan(Integer value) {
            addCriterion("created_uid >", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_uid >=", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThan(Integer value) {
            addCriterion("created_uid <", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_uid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanOrEqualTo(Integer value) {
            addCriterion("created_uid <=", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanOrEqualToColumn(RoleMaster.Column column) {
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

        public Criteria andCreatedAtEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("created_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualToColumn(RoleMaster.Column column) {
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

        public Criteria andUpdatedUidEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidNotEqualTo(Integer value) {
            addCriterion("updated_uid <>", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidNotEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThan(Integer value) {
            addCriterion("updated_uid >", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_uid >=", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThan(Integer value) {
            addCriterion("updated_uid <", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanOrEqualTo(Integer value) {
            addCriterion("updated_uid <=", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanOrEqualToColumn(RoleMaster.Column column) {
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

        public Criteria andUpdatedAtEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("updated_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualToColumn(RoleMaster.Column column) {
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

        public Criteria andRoleIdentifierIsNull() {
            addCriterion("role_identifier is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierIsNotNull() {
            addCriterion("role_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierEqualTo(String value) {
            addCriterion("role_identifier =", value, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_identifier = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierNotEqualTo(String value) {
            addCriterion("role_identifier <>", value, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierNotEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_identifier <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierGreaterThan(String value) {
            addCriterion("role_identifier >", value, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierGreaterThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_identifier > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("role_identifier >=", value, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierGreaterThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_identifier >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierLessThan(String value) {
            addCriterion("role_identifier <", value, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierLessThanColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_identifier < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierLessThanOrEqualTo(String value) {
            addCriterion("role_identifier <=", value, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierLessThanOrEqualToColumn(RoleMaster.Column column) {
            addCriterion(new StringBuilder("role_identifier <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierLike(String value) {
            addCriterion("role_identifier like", value, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierNotLike(String value) {
            addCriterion("role_identifier not like", value, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierIn(List<String> values) {
            addCriterion("role_identifier in", values, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierNotIn(List<String> values) {
            addCriterion("role_identifier not in", values, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierBetween(String value1, String value2) {
            addCriterion("role_identifier between", value1, value2, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierNotBetween(String value1, String value2) {
            addCriterion("role_identifier not between", value1, value2, "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria andRoleNameLikeInsensitive(String value) {
            addCriterion("upper(role_name) like", value.toUpperCase(), "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleIdentifierLikeInsensitive(String value) {
            addCriterion("upper(role_identifier) like", value.toUpperCase(), "roleIdentifier");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private RoleMasterCriteria example;

        protected Criteria(RoleMasterCriteria example) {
            super();
            this.example = example;
        }

        public RoleMasterCriteria example() {
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
        void example(ko.alliex.energy.domain.entity.generator.RoleMasterCriteria example);
    }
}