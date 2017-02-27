package upc.epe.dao.tiendavirtual.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import upc.epe.general.util.CadenaUtil;

public class VideosParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public VideosParamDef() {
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
        
        
        public Criteria andStrTituloLike(String value) {
            addCriterion("upper(titulo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloNotLike(String value) {
            addCriterion("titulo not like", "%" + CadenaUtil.getStr(value) + "%", "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloEqualTo(String value) {
            addCriterion("titulo =", CadenaUtil.getStr(value), "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloNotEqualTo(String value) {
            addCriterion("titulo <>", CadenaUtil.getStr(value), "titulo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTituloIsNull() {
            addCriterion("titulo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloIsNotNull() {
            addCriterion("titulo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloGreaterThan(String value) {
            addCriterion("titulo >", value, "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloGreaterThanOrEqualTo(String value) {
            addCriterion("titulo >=", value, "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloLessThan(String value) {
            addCriterion("titulo <", value, "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloLessThanOrEqualTo(String value) {
            addCriterion("titulo <=", value, "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloIn(List<String> values) {
            addCriterion("titulo in", values, "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloNotIn(List<String> values) {
            addCriterion("titulo not in", values, "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloBetween(String value1, String value2) {
            addCriterion("titulo between", value1, value2, "titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrTituloNotBetween(String value1, String value2) {
            addCriterion("titulo not between", value1, value2, "titulo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDescripcionLike(String value) {
            addCriterion("upper(descripcion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionNotLike(String value) {
            addCriterion("descripcion not like", "%" + CadenaUtil.getStr(value) + "%", "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionEqualTo(String value) {
            addCriterion("descripcion =", CadenaUtil.getStr(value), "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionNotEqualTo(String value) {
            addCriterion("descripcion <>", CadenaUtil.getStr(value), "descripcion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDescripcionIsNull() {
            addCriterion("descripcion is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionIsNotNull() {
            addCriterion("descripcion is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionGreaterThan(String value) {
            addCriterion("descripcion >", value, "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("descripcion >=", value, "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionLessThan(String value) {
            addCriterion("descripcion <", value, "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionLessThanOrEqualTo(String value) {
            addCriterion("descripcion <=", value, "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionIn(List<String> values) {
            addCriterion("descripcion in", values, "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionNotIn(List<String> values) {
            addCriterion("descripcion not in", values, "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionBetween(String value1, String value2) {
            addCriterion("descripcion between", value1, value2, "descripcion");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripcionNotBetween(String value1, String value2) {
            addCriterion("descripcion not between", value1, value2, "descripcion");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCatalogoEqualTo(Integer value) {
            addCriterion("id_catalogo =", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoNotEqualTo(Integer value) {
            addCriterion("id_catalogo <>", value, "id_catalogo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCatalogoIsNull() {
            addCriterion("id_catalogo is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoIsNotNull() {
            addCriterion("id_catalogo is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoGreaterThan(Integer value) {
            addCriterion("id_catalogo >", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_catalogo >=", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoLessThan(Integer value) {
            addCriterion("id_catalogo <", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoLessThanOrEqualTo(Integer value) {
            addCriterion("id_catalogo <=", value, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoIn(List<Integer> values) {
            addCriterion("id_catalogo in", values, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoNotIn(List<Integer> values) {
            addCriterion("id_catalogo not in", values, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoBetween(Integer value1, Integer value2) {
            addCriterion("id_catalogo between", value1, value2, "id_catalogo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdCatalogoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_catalogo not between", value1, value2, "id_catalogo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrVarImagenLike(String value) {
            addCriterion("upper(var_imagen) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenNotLike(String value) {
            addCriterion("var_imagen not like", "%" + CadenaUtil.getStr(value) + "%", "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenEqualTo(String value) {
            addCriterion("var_imagen =", CadenaUtil.getStr(value), "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenNotEqualTo(String value) {
            addCriterion("var_imagen <>", CadenaUtil.getStr(value), "var_imagen");
            return (Criteria) this;
        }
        
        
        public Criteria andStrVarImagenIsNull() {
            addCriterion("var_imagen is null");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenIsNotNull() {
            addCriterion("var_imagen is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenGreaterThan(String value) {
            addCriterion("var_imagen >", value, "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenGreaterThanOrEqualTo(String value) {
            addCriterion("var_imagen >=", value, "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenLessThan(String value) {
            addCriterion("var_imagen <", value, "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenLessThanOrEqualTo(String value) {
            addCriterion("var_imagen <=", value, "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenIn(List<String> values) {
            addCriterion("var_imagen in", values, "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenNotIn(List<String> values) {
            addCriterion("var_imagen not in", values, "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenBetween(String value1, String value2) {
            addCriterion("var_imagen between", value1, value2, "var_imagen");
            return (Criteria) this;
        }
        
        public Criteria andStrVarImagenNotBetween(String value1, String value2) {
            addCriterion("var_imagen not between", value1, value2, "var_imagen");
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
