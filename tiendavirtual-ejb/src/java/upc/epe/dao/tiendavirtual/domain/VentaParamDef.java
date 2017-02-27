package upc.epe.dao.tiendavirtual.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import upc.epe.general.util.CadenaUtil;

public class VentaParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public VentaParamDef() {
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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
        
                
        
        public Criteria andSrlIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdUsuarioEqualTo(Integer value) {
            addCriterion("id_usuario =", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioNotEqualTo(Integer value) {
            addCriterion("id_usuario <>", value, "id_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdUsuarioIsNull() {
            addCriterion("id_usuario is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioIsNotNull() {
            addCriterion("id_usuario is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioGreaterThan(Integer value) {
            addCriterion("id_usuario >", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_usuario >=", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioLessThan(Integer value) {
            addCriterion("id_usuario <", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioLessThanOrEqualTo(Integer value) {
            addCriterion("id_usuario <=", value, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioIn(List<Integer> values) {
            addCriterion("id_usuario in", values, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioNotIn(List<Integer> values) {
            addCriterion("id_usuario not in", values, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario between", value1, value2, "id_usuario");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario not between", value1, value2, "id_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andDblTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }
        
        
        public Criteria andDblTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }
        
        public Criteria andDblTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaEqualTo(Date value) {
            addCriterion("fecha =", value, "fecha");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaNotEqualTo(Date value) {
            addCriterion("fecha <>", value, "fecha");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaIsNull() {
            addCriterion("fecha is null");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaIsNotNull() {
            addCriterion("fecha is not null");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaGreaterThan(Date value) {
            addCriterion("fecha >", value, "fecha");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha >=", value, "fecha");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaLessThan(Date value) {
            addCriterion("fecha <", value, "fecha");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaLessThanOrEqualTo(Date value) {
            addCriterion("fecha <=", value, "fecha");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaIn(List<Date> values) {
            addCriterion("fecha in", values, "fecha");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaNotIn(List<Date> values) {
            addCriterion("fecha not in", values, "fecha");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaBetween(Date value1, Date value2) {
            addCriterion("fecha between", value1, value2, "fecha");
            return (Criteria) this;
        }
        
        public Criteria andTimFechaNotBetween(Date value1, Date value2) {
            addCriterion("fecha not between", value1, value2, "fecha");
            return (Criteria) this;
        }
        
		
    }
    
    public static class Criteria extends GeneratedCriteria {
        
        protected Criteria() {
            super();
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
	
}
