package upc.epe.dao.tiendavirtual.domain;

import java.util.Date;
import java.util.List;
import upc.epe.general.util.CadenaUtil;

public class Venta extends VentaKey {
	
	private Integer intIdUsuario;
	private Double dblTotal;
	private String timFechaFecha;
	private String timFechaHora;
	
	public String getTimFechaFecha() {
		return timFechaFecha;
	}
	public void setTimFechaFecha(String timFechaFecha) {
		this.timFechaFecha = timFechaFecha;
	}
	public String getTimFechaHora() {
		return timFechaHora;
	}
	public void setTimFechaHora(String timFechaHora) {
		this.timFechaHora = timFechaHora;
	}
	public String getTimFechaFechaHora() {
		return timFechaFecha + " " + timFechaHora;
	}
	public void setLngFecha(Long lngfecha) {
		timFechaFecha = CadenaUtil.getStrDate(new Date(lngfecha));
		timFechaHora	= CadenaUtil.getStrHoraMinutos(new Date(lngfecha));
	}
	public Integer getIntIdUsuario() {
		return intIdUsuario;
	}
	public void setIntIdUsuario(Integer intIdUsuario) {
		this.intIdUsuario = intIdUsuario;
	}
	public Double getDblTotal() {
		return dblTotal;
	}
	public void setDblTotal(Double dblTotal) {
		this.dblTotal = dblTotal;
	}
	public Date getTimFecha() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaFecha + " " + this.timFechaHora);
	}
	public void setTimFecha(Date timFecha) {
		this.timFechaFecha = CadenaUtil.getStrDate(timFecha);
		this.timFechaHora = CadenaUtil.getStrHoraMinutos(timFecha);
	}
	
}
