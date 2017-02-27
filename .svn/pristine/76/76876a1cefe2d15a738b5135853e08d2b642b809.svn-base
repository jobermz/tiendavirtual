package upc.epe.dao.tiendavirtual.mapper;

import java.util.List;
import upc.epe.dao.tiendavirtual.domain.Tipousuario;
import upc.epe.dao.tiendavirtual.domain.TipousuarioKey;
import upc.epe.dao.tiendavirtual.domain.TipousuarioParamDef;

public interface TipousuarioMapper {
	
	public List<Tipousuario> selectByDefaultParameter(TipousuarioParamDef tipousuarioParamDef);
	public Tipousuario selectByPrimaryKey(TipousuarioKey tipousuarioKey);
	public int insertSelective(Tipousuario tipousuario);
	public int updateByPrimaryKeySelective(Tipousuario tipousuario);
	public int deleteByPrimaryKey(TipousuarioKey tipousuarioKey);
	
	public int lastSequence();

	
}
