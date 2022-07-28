package ko.alliex.energy.domain.entity.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApiMasterCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApiMasterCriteria() {
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

    public ApiMasterCriteria orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ApiMasterCriteria orderBy(String ... orderByClauses) {
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
        ApiMasterCriteria example = new ApiMasterCriteria();
        return example.createCriteria();
    }

    public ApiMasterCriteria when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ApiMasterCriteria when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andApiIdIsNull() {
            addCriterion("api_id is null");
            return (Criteria) this;
        }

        public Criteria andApiIdIsNotNull() {
            addCriterion("api_id is not null");
            return (Criteria) this;
        }

        public Criteria andApiIdEqualTo(Integer value) {
            addCriterion("api_id =", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiIdNotEqualTo(Integer value) {
            addCriterion("api_id <>", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThan(Integer value) {
            addCriterion("api_id >", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("api_id >=", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiIdLessThan(Integer value) {
            addCriterion("api_id <", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiIdLessThanOrEqualTo(Integer value) {
            addCriterion("api_id <=", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdLessThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiIdIn(List<Integer> values) {
            addCriterion("api_id in", values, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotIn(List<Integer> values) {
            addCriterion("api_id not in", values, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdBetween(Integer value1, Integer value2) {
            addCriterion("api_id between", value1, value2, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("api_id not between", value1, value2, "apiId");
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

        public Criteria andModuleIdentifierEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierNotEqualTo(String value) {
            addCriterion("module_identifier <>", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierGreaterThan(String value) {
            addCriterion("module_identifier >", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("module_identifier >=", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLessThan(String value) {
            addCriterion("module_identifier <", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("module_identifier < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLessThanOrEqualTo(String value) {
            addCriterion("module_identifier <=", value, "moduleIdentifier");
            return (Criteria) this;
        }

        public Criteria andModuleIdentifierLessThanOrEqualToColumn(ApiMaster.Column column) {
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

        public Criteria andApiUrlIsNull() {
            addCriterion("api_url is null");
            return (Criteria) this;
        }

        public Criteria andApiUrlIsNotNull() {
            addCriterion("api_url is not null");
            return (Criteria) this;
        }

        public Criteria andApiUrlEqualTo(String value) {
            addCriterion("api_url =", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiUrlNotEqualTo(String value) {
            addCriterion("api_url <>", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThan(String value) {
            addCriterion("api_url >", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThanOrEqualTo(String value) {
            addCriterion("api_url >=", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThan(String value) {
            addCriterion("api_url <", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThanOrEqualTo(String value) {
            addCriterion("api_url <=", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlLessThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiUrlLike(String value) {
            addCriterion("api_url like", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotLike(String value) {
            addCriterion("api_url not like", value, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlIn(List<String> values) {
            addCriterion("api_url in", values, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotIn(List<String> values) {
            addCriterion("api_url not in", values, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlBetween(String value1, String value2) {
            addCriterion("api_url between", value1, value2, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiUrlNotBetween(String value1, String value2) {
            addCriterion("api_url not between", value1, value2, "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiMethodIsNull() {
            addCriterion("api_method is null");
            return (Criteria) this;
        }

        public Criteria andApiMethodIsNotNull() {
            addCriterion("api_method is not null");
            return (Criteria) this;
        }

        public Criteria andApiMethodEqualTo(String value) {
            addCriterion("api_method =", value, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_method = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiMethodNotEqualTo(String value) {
            addCriterion("api_method <>", value, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_method <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiMethodGreaterThan(String value) {
            addCriterion("api_method >", value, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_method > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiMethodGreaterThanOrEqualTo(String value) {
            addCriterion("api_method >=", value, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_method >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiMethodLessThan(String value) {
            addCriterion("api_method <", value, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_method < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiMethodLessThanOrEqualTo(String value) {
            addCriterion("api_method <=", value, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodLessThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("api_method <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApiMethodLike(String value) {
            addCriterion("api_method like", value, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodNotLike(String value) {
            addCriterion("api_method not like", value, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodIn(List<String> values) {
            addCriterion("api_method in", values, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodNotIn(List<String> values) {
            addCriterion("api_method not in", values, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodBetween(String value1, String value2) {
            addCriterion("api_method between", value1, value2, "apiMethod");
            return (Criteria) this;
        }

        public Criteria andApiMethodNotBetween(String value1, String value2) {
            addCriterion("api_method not between", value1, value2, "apiMethod");
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

        public Criteria andIsDeletedEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Short value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Short value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Short value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("is_deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Short value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualToColumn(ApiMaster.Column column) {
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

        public Criteria andCreatedUidEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_uid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidNotEqualTo(Integer value) {
            addCriterion("created_uid <>", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_uid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThan(Integer value) {
            addCriterion("created_uid >", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_uid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_uid >=", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_uid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThan(Integer value) {
            addCriterion("created_uid <", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_uid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanOrEqualTo(Integer value) {
            addCriterion("created_uid <=", value, "createdUid");
            return (Criteria) this;
        }

        public Criteria andCreatedUidLessThanOrEqualToColumn(ApiMaster.Column column) {
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

        public Criteria andCreatedAtEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("created_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualToColumn(ApiMaster.Column column) {
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

        public Criteria andUpdatedUidEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidNotEqualTo(Integer value) {
            addCriterion("updated_uid <>", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThan(Integer value) {
            addCriterion("updated_uid >", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_uid >=", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThan(Integer value) {
            addCriterion("updated_uid <", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_uid < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanOrEqualTo(Integer value) {
            addCriterion("updated_uid <=", value, "updatedUid");
            return (Criteria) this;
        }

        public Criteria andUpdatedUidLessThanOrEqualToColumn(ApiMaster.Column column) {
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

        public Criteria andUpdatedAtEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualToColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanColumn(ApiMaster.Column column) {
            addCriterion(new StringBuilder("updated_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualToColumn(ApiMaster.Column column) {
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

        public Criteria andApiUrlLikeInsensitive(String value) {
            addCriterion("upper(api_url) like", value.toUpperCase(), "apiUrl");
            return (Criteria) this;
        }

        public Criteria andApiMethodLikeInsensitive(String value) {
            addCriterion("upper(api_method) like", value.toUpperCase(), "apiMethod");
            return (Criteria) this;
        }

        public Criteria addConditionSql(String conditionSql) {
            addCriterion(conditionSql);
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ApiMasterCriteria example;

        protected Criteria(ApiMasterCriteria example) {
            super();
            this.example = example;
        }

        public ApiMasterCriteria example() {
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
        void example(ko.alliex.energy.domain.entity.generator.ApiMasterCriteria example);
    }
}