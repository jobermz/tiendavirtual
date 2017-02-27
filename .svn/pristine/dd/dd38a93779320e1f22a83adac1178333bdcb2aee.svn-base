package upc.epe.business.core.tiendavirtual.dto;

import java.util.Date;
import java.util.List;
import upc.epe.general.util.CadenaUtil;

public class VentadetDto {
	private Integer srlId;
	private Integer intIdVenta;
	private Integer intIdVideo;
	private Double dblPrecio;
	private Integer intCantidad;
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
	public Integer getSrlId() {
		return srlId;
	}
	public void setSrlId(Integer srlId) {
		this.srlId = srlId;
	}
	public Integer getIntIdVenta() {
		return intIdVenta;
	}
	public void setIntIdVenta(Integer intIdVenta) {
		this.intIdVenta = intIdVenta;
	}
	public Integer getIntIdVideo() {
		return intIdVideo;
	}
	public void setIntIdVideo(Integer intIdVideo) {
		this.intIdVideo = intIdVideo;
	}
	public Double getDblPrecio() {
		return dblPrecio;
	}
	public void setDblPrecio(Double dblPrecio) {
		this.dblPrecio = dblPrecio;
	}
	public Integer getIntCantidad() {
		return intCantidad;
	}
	public void setIntCantidad(Integer intCantidad) {
		this.intCantidad = intCantidad;
	}
	public Date getTimFecha() {
		return CadenaUtil.getDateHoraMinutosFromStr(this.timFechaFecha + " " + this.timFechaHora);
	}
	public void setTimFecha(Date timFecha) {
		this.timFechaFecha = CadenaUtil.getStrDate(timFecha);
		this.timFechaHora = CadenaUtil.getStrHoraMinutos(timFecha);
	}
	
}
