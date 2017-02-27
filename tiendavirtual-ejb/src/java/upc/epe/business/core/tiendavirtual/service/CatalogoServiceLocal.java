package upc.epe.business.core.tiendavirtual.service;

import java.util.List;
import javax.ejb.Local;
import upc.epe.business.core.tiendavirtual.dto.CatalogoDto;
import upc.epe.dao.tiendavirtual.domain.Catalogo;

@Local
public interface CatalogoServiceLocal {
	
	public List<CatalogoDto> buscar(CatalogoDto catalogoDto) throws Exception;
	public CatalogoDto buscarById(CatalogoDto catalogoDto) throws Exception;
	public Integer guardar(CatalogoDto catalogoDto) throws Exception;
	public Integer eliminar(CatalogoDto catalogoDto) throws Exception;
	
}
