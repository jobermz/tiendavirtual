package upc.epe.dao.tiendavirtual.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import upc.epe.general.util.CadenaUtil;

public class UsuariosParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public UsuariosParamDef() {
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
        
        
        public Criteria andStrLoginLike(String value) {
            addCriterion("upper(login) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginNotLike(String value) {
            addCriterion("login not like", "%" + CadenaUtil.getStr(value) + "%", "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginEqualTo(String value) {
            addCriterion("login =", CadenaUtil.getStr(value), "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginNotEqualTo(String value) {
            addCriterion("login <>", CadenaUtil.getStr(value), "login");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLoginIsNull() {
            addCriterion("login is null");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginIsNotNull() {
            addCriterion("login is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginGreaterThan(String value) {
            addCriterion("login >", value, "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginGreaterThanOrEqualTo(String value) {
            addCriterion("login >=", value, "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginLessThan(String value) {
            addCriterion("login <", value, "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginLessThanOrEqualTo(String value) {
            addCriterion("login <=", value, "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginIn(List<String> values) {
            addCriterion("login in", values, "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginNotIn(List<String> values) {
            addCriterion("login not in", values, "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginBetween(String value1, String value2) {
            addCriterion("login between", value1, value2, "login");
            return (Criteria) this;
        }
        
        public Criteria andStrLoginNotBetween(String value1, String value2) {
            addCriterion("login not between", value1, value2, "login");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPasswordLike(String value) {
            addCriterion("upper(password) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordNotLike(String value) {
            addCriterion("password not like", "%" + CadenaUtil.getStr(value) + "%", "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordEqualTo(String value) {
            addCriterion("password =", CadenaUtil.getStr(value), "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordNotEqualTo(String value) {
            addCriterion("password <>", CadenaUtil.getStr(value), "password");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }
        
        public Criteria andStrPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdTipoEqualTo(Integer value) {
            addCriterion("id_tipo =", value, "id_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoNotEqualTo(Integer value) {
            addCriterion("id_tipo <>", value, "id_tipo");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdTipoIsNull() {
            addCriterion("id_tipo is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoIsNotNull() {
            addCriterion("id_tipo is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoGreaterThan(Integer value) {
            addCriterion("id_tipo >", value, "id_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_tipo >=", value, "id_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoLessThan(Integer value) {
            addCriterion("id_tipo <", value, "id_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoLessThanOrEqualTo(Integer value) {
            addCriterion("id_tipo <=", value, "id_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoIn(List<Integer> values) {
            addCriterion("id_tipo in", values, "id_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoNotIn(List<Integer> values) {
            addCriterion("id_tipo not in", values, "id_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo between", value1, value2, "id_tipo");
            return (Criteria) this;
        }
        
        public Criteria andIntIdTipoNotBetween(Integer value1, Integer value2) {
            addCriterion("id_tipo not between", value1, value2, "id_tipo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreCompletoLike(String value) {
            addCriterion("upper(nombre_completo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoNotLike(String value) {
            addCriterion("nombre_completo not like", "%" + CadenaUtil.getStr(value) + "%", "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoEqualTo(String value) {
            addCriterion("nombre_completo =", CadenaUtil.getStr(value), "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoNotEqualTo(String value) {
            addCriterion("nombre_completo <>", CadenaUtil.getStr(value), "nombre_completo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreCompletoIsNull() {
            addCriterion("nombre_completo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoIsNotNull() {
            addCriterion("nombre_completo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoGreaterThan(String value) {
            addCriterion("nombre_completo >", value, "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_completo >=", value, "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoLessThan(String value) {
            addCriterion("nombre_completo <", value, "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoLessThanOrEqualTo(String value) {
            addCriterion("nombre_completo <=", value, "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoIn(List<String> values) {
            addCriterion("nombre_completo in", values, "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoNotIn(List<String> values) {
            addCriterion("nombre_completo not in", values, "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoBetween(String value1, String value2) {
            addCriterion("nombre_completo between", value1, value2, "nombre_completo");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreCompletoNotBetween(String value1, String value2) {
            addCriterion("nombre_completo not between", value1, value2, "nombre_completo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEmailLike(String value) {
            addCriterion("upper(email) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailNotLike(String value) {
            addCriterion("email not like", "%" + CadenaUtil.getStr(value) + "%", "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailEqualTo(String value) {
            addCriterion("email =", CadenaUtil.getStr(value), "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailNotEqualTo(String value) {
            addCriterion("email <>", CadenaUtil.getStr(value), "email");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }
        
        public Criteria andStrEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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
