package upc.epe.business.core.tiendavirtual.service;

import java.util.List;
import javax.ejb.Local;
import upc.epe.business.core.tiendavirtual.dto.UsuariosDto;
import upc.epe.dao.tiendavirtual.domain.Usuarios;

@Local
public interface UsuariosServiceLocal {
	
	public List<UsuariosDto> buscar(UsuariosDto usuariosDto) throws Exception;
	public UsuariosDto buscarById(UsuariosDto usuariosDto) throws Exception;
	public Integer guardar(UsuariosDto usuariosDto) throws Exception;
	public Integer eliminar(UsuariosDto usuariosDto) throws Exception;
	
}
