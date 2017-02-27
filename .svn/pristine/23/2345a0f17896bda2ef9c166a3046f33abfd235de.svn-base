/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upc.epe.business.core.tiendavirtual.service.impl;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import upc.epe.business.core.tiendavirtual.dto.VideosDto;
import upc.epe.business.core.tiendavirtual.service.VideosServiceLocal;

/**
 *
 * @author pcfx
 */
@WebService(serviceName = "VideosWS")
@Stateless()
public class VideosWS {

    @EJB
    private VideosServiceLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "buscar")
    public List<VideosDto> buscar(@WebParam(name = "videosDto") VideosDto videosDto) throws Exception {
        return ejbRef.buscar(videosDto);
    }

    @WebMethod(operationName = "buscarById")
    public VideosDto buscarById(@WebParam(name = "videosDto") VideosDto videosDto) throws Exception {
        return ejbRef.buscarById(videosDto);
    }

    @WebMethod(operationName = "guardar")
    public Integer guardar(@WebParam(name = "videosDto") VideosDto videosDto) throws Exception {
        return ejbRef.guardar(videosDto);
    }

    @WebMethod(operationName = "eliminar")
    public Integer eliminar(@WebParam(name = "videosDto") VideosDto videosDto) throws Exception {
        return ejbRef.eliminar(videosDto);
    }
    
}
