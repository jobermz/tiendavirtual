package upc.epe.business.core.tiendavirtual.dto;

import java.util.Date;
import java.util.List;
import upc.epe.general.util.CadenaUtil;

public class UsuariosDto {
	private Integer srlId;
	private String strLogin;
	private String strPassword;
	private Integer intIdTipo;
	private String strNombreCompleto;
	private String strEmail;
	public Integer getSrlId() {
		return srlId;
	}
	public void setSrlId(Integer srlId) {
		this.srlId = srlId;
	}
	public String getStrLogin() {
		return strLogin;
	}
	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}
	public String getStrPassword() {
		return strPassword;
	}
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}
	public Integer getIntIdTipo() {
		return intIdTipo;
	}
	public void setIntIdTipo(Integer intIdTipo) {
		this.intIdTipo = intIdTipo;
	}
	public String getStrNombreCompleto() {
		return strNombreCompleto;
	}
	public void setStrNombreCompleto(String strNombreCompleto) {
		this.strNombreCompleto = strNombreCompleto;
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	
}
