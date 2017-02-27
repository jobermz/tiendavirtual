package upc.epe.business.core.tiendavirtual.dto;

import java.util.Date;
import java.util.List;
import upc.epe.general.util.CadenaUtil;

public class VideosDto {
    private Integer srlId;
    private String strTitulo;
    private String strDescripcion;
    private Integer intIdCatalogo;
    private String strIdCatalogoDesc;
    private String strVarImagen;
    private Double strPrecio;
    private Integer strStock;

    public Integer getSrlId() {
            return srlId;
    }
    public void setSrlId(Integer srlId) {
            this.srlId = srlId;
    }
    public String getStrTitulo() {
            return strTitulo;
    }
    public void setStrTitulo(String strTitulo) {
            this.strTitulo = strTitulo;
    }
    public String getStrDescripcion() {
            return strDescripcion;
    }
    public void setStrDescripcion(String strDescripcion) {
            this.strDescripcion = strDescripcion;
    }
    public Integer getIntIdCatalogo() {
            return intIdCatalogo;
    }
    public void setIntIdCatalogo(Integer intIdCatalogo) {
            this.intIdCatalogo = intIdCatalogo;
    }
    public String getStrVarImagen() {
            return strVarImagen;
    }
    public void setStrVarImagen(String strVarImagen) {
            this.strVarImagen = strVarImagen;
    }

    /**
     * @return the strIdCatalogoDesc
     */
    public String getStrIdCatalogoDesc() {
        return strIdCatalogoDesc;
    }

    /**
     * @param strIdCatalogoDesc the strIdCatalogoDesc to set
     */
    public void setStrIdCatalogoDesc(String strIdCatalogoDesc) {
        this.strIdCatalogoDesc = strIdCatalogoDesc;
    }

    /**
     * @return the strPrecio
     */
    public Double getStrPrecio() {
        return strPrecio;
    }

    /**
     * @param strPrecio the strPrecio to set
     */
    public void setStrPrecio(Double strPrecio) {
        this.strPrecio = strPrecio;
    }

    /**
     * @return the strStock
     */
    public Integer getStrStock() {
        return strStock;
    }

    /**
     * @param strStock the strStock to set
     */
    public void setStrStock(Integer strStock) {
        this.strStock = strStock;
    }
	
}
