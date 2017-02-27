package upc.epe.business.core.tiendavirtual.service;

import java.util.List;
import javax.ejb.Local;
import upc.epe.business.core.tiendavirtual.dto.VideosDto;

@Local
public interface VideosServiceLocal {
	
	public List<VideosDto> buscar(VideosDto videosDto) throws Exception;
	public VideosDto buscarById(VideosDto videosDto) throws Exception;
	public Integer guardar(VideosDto videosDto) throws Exception;
	public Integer eliminar(VideosDto videosDto) throws Exception;
	
}
