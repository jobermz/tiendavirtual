package upc.epe.general.util;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracionProperties {
	public static String PLANILLA_ID_USUARIO_RESPONSABLE	= "planilla_id_usuario_responsable";
	public static String PLANILLA_PROMOTOR_NOMBRE			= "planilla_promotor_nombre";
	
	public static String PLANILLA_CODIGO					= "planilla_codigo";
	public static String PLANILLA_PAGINA					= "planilla_pagina";
	public static String PLANILLA_TIPO_PLANILLA				= "planilla_tipo_planilla";
	
	public static String USUARIO_ID_PERFIL					= "usuario_id_perfil";
	public static String ADMIN_ID_PERFIL					= "admin_id_perfil";
	
	public static String ESTADO_ACTIVO						= "estado_activo";
	
	public static List<String> getConstanteList(String strParam) {
		List<String> list	= new ArrayList<String>();
		int intIdContador	= 0;
		while(true) {
			String strValue	= getConstanteStr(strParam + CadenaUtil.llenarPorIzquierda(String.valueOf(intIdContador), 2, "0") );
			if(strValue.equals("")) {
				break;
			}
			intIdContador++;
			list.add(strValue);
		}
		return list;
	}
	
	public static int getConstanteInt(String strParam) {
		return CadenaUtil.getInte(ConfiguracionProperties.getParametro("configuracion", strParam));
	}
	
	public static String getConstanteStr(String strParam) {
		return CadenaUtil.getStr(ConfiguracionProperties.getParametro("configuracion", strParam));
	}
	
	private static String getParametro(String file, String paramName) {
		return ObtienePoperties.getParametro(file, paramName);
	}
	
}