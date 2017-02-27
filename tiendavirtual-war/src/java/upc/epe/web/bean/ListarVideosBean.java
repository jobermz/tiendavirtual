/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upc.epe.web.bean;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.Initialized;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import upc.epe.business.core.tiendavirtual.dto.VideosDto;
import upc.epe.business.core.tiendavirtual.service.VideosServiceLocal;
import upc.epe.business.core.tiendavirtual.service.impl.VideosService;

/**
 *
 * @author pc
 */
@Named(value = "listarVideosBean")
@RequestScoped
public class ListarVideosBean {

    @EJB
    private VideosServiceLocal videosServiceLocal;
    
    private List<VideosDto> listVideos;
    /**
     * Creates a new instance of VideosBean
     */
    public ListarVideosBean() {
    }
    
    @PostConstruct
    public void inicializar() {
        obtenerListaVideos();
    }
    public String irAListaVideos() {
        return "paginas/tienda/listarVideos.xhtml";
    }
    public void obtenerListaVideos() {
        try {
            setListVideos(videosServiceLocal.buscar(new VideosDto()));
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * @return the listVideos
     */
    public List<VideosDto> getListVideos() {
        return listVideos;
    }

    /**
     * @param listVideos the listVideos to set
     */
    public void setListVideos(List<VideosDto> listVideos) {
        this.listVideos = listVideos;
    }
    
}
