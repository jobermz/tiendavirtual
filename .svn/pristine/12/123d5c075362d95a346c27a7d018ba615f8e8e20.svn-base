package upc.epe.dao.tiendavirtual.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import upc.epe.general.util.CadenaUtil;

public class VentadetParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public VentadetParamDef() {
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
        
        
        public Criteria andIntIdVentaEqualTo(Integer value) {
            addCriterion("id_venta =", value, "id_venta");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaNotEqualTo(Integer value) {
            addCriterion("id_venta <>", value, "id_venta");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdVentaIsNull() {
            addCriterion("id_venta is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaIsNotNull() {
            addCriterion("id_venta is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaGreaterThan(Integer value) {
            addCriterion("id_venta >", value, "id_venta");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_venta >=", value, "id_venta");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaLessThan(Integer value) {
            addCriterion("id_venta <", value, "id_venta");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaLessThanOrEqualTo(Integer value) {
            addCriterion("id_venta <=", value, "id_venta");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaIn(List<Integer> values) {
            addCriterion("id_venta in", values, "id_venta");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaNotIn(List<Integer> values) {
            addCriterion("id_venta not in", values, "id_venta");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaBetween(Integer value1, Integer value2) {
            addCriterion("id_venta between", value1, value2, "id_venta");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVentaNotBetween(Integer value1, Integer value2) {
            addCriterion("id_venta not between", value1, value2, "id_venta");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdVideoEqualTo(Integer value) {
            addCriterion("id_video =", value, "id_video");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoNotEqualTo(Integer value) {
            addCriterion("id_video <>", value, "id_video");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdVideoIsNull() {
            addCriterion("id_video is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoIsNotNull() {
            addCriterion("id_video is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoGreaterThan(Integer value) {
            addCriterion("id_video >", value, "id_video");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_video >=", value, "id_video");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoLessThan(Integer value) {
            addCriterion("id_video <", value, "id_video");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoLessThanOrEqualTo(Integer value) {
            addCriterion("id_video <=", value, "id_video");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoIn(List<Integer> values) {
            addCriterion("id_video in", values, "id_video");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoNotIn(List<Integer> values) {
            addCriterion("id_video not in", values, "id_video");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoBetween(Integer value1, Integer value2) {
            addCriterion("id_video between", value1, value2, "id_video");
            return (Criteria) this;
        }
        
        public Criteria andIntIdVideoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_video not between", value1, value2, "id_video");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPrecioEqualTo(Double value) {
            addCriterion("precio =", value, "precio");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioNotEqualTo(Double value) {
            addCriterion("precio <>", value, "precio");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPrecioIsNull() {
            addCriterion("precio is null");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioIsNotNull() {
            addCriterion("precio is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioGreaterThan(Double value) {
            addCriterion("precio >", value, "precio");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioGreaterThanOrEqualTo(Double value) {
            addCriterion("precio >=", value, "precio");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioLessThan(Double value) {
            addCriterion("precio <", value, "precio");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioLessThanOrEqualTo(Double value) {
            addCriterion("precio <=", value, "precio");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioIn(List<Double> values) {
            addCriterion("precio in", values, "precio");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioNotIn(List<Double> values) {
            addCriterion("precio not in", values, "precio");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioBetween(Double value1, Double value2) {
            addCriterion("precio between", value1, value2, "precio");
            return (Criteria) this;
        }
        
        public Criteria andDblPrecioNotBetween(Double value1, Double value2) {
            addCriterion("precio not between", value1, value2, "precio");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCantidadEqualTo(Integer value) {
            addCriterion("cantidad =", value, "cantidad");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadNotEqualTo(Integer value) {
            addCriterion("cantidad <>", value, "cantidad");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCantidadIsNull() {
            addCriterion("cantidad is null");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadIsNotNull() {
            addCriterion("cantidad is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadGreaterThan(Integer value) {
            addCriterion("cantidad >", value, "cantidad");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadGreaterThanOrEqualTo(Integer value) {
            addCriterion("cantidad >=", value, "cantidad");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadLessThan(Integer value) {
            addCriterion("cantidad <", value, "cantidad");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadLessThanOrEqualTo(Integer value) {
            addCriterion("cantidad <=", value, "cantidad");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadIn(List<Integer> values) {
            addCriterion("cantidad in", values, "cantidad");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadNotIn(List<Integer> values) {
            addCriterion("cantidad not in", values, "cantidad");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadBetween(Integer value1, Integer value2) {
            addCriterion("cantidad between", value1, value2, "cantidad");
            return (Criteria) this;
        }
        
        public Criteria andIntCantidadNotBetween(Integer value1, Integer value2) {
            addCriterion("cantidad not between", value1, value2, "cantidad");
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
