package upc.epe.dao.tiendavirtual.mapper;

import java.util.List;
import upc.epe.dao.tiendavirtual.domain.Usuarios;
import upc.epe.dao.tiendavirtual.domain.UsuariosKey;
import upc.epe.dao.tiendavirtual.domain.UsuariosParamDef;

public interface UsuariosMapper {
	
	public List<Usuarios> selectByDefaultParameter(UsuariosParamDef usuariosParamDef);
	public Usuarios selectByPrimaryKey(UsuariosKey usuariosKey);
	public int insertSelective(Usuarios usuarios);
	public int updateByPrimaryKeySelective(Usuarios usuarios);
	public int deleteByPrimaryKey(UsuariosKey usuariosKey);
	
	public int lastSequence();

	
}
