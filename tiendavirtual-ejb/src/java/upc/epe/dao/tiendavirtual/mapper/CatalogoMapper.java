package upc.epe.dao.tiendavirtual.mapper;

import java.util.List;
import upc.epe.dao.tiendavirtual.domain.Catalogo;
import upc.epe.dao.tiendavirtual.domain.CatalogoKey;
import upc.epe.dao.tiendavirtual.domain.CatalogoParamDef;

public interface CatalogoMapper {
	
	public List<Catalogo> selectByDefaultParameter(CatalogoParamDef catalogoParamDef);
	public Catalogo selectByPrimaryKey(CatalogoKey catalogoKey);
	public int insertSelective(Catalogo catalogo);
	public int updateByPrimaryKeySelective(Catalogo catalogo);
	public int deleteByPrimaryKey(CatalogoKey catalogoKey);
	
	public int lastSequence();

	
}
