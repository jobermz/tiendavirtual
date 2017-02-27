package upc.epe.dao.tiendavirtual.domain;

import java.util.Date;
import java.util.List;
import upc.epe.general.util.CadenaUtil;

public class Usuarios extends UsuariosKey {
	
	private String strLogin;
	private String strPassword;
	private Integer intIdTipo;
	private String strNombreCompleto;
	private String strEmail;
	
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
