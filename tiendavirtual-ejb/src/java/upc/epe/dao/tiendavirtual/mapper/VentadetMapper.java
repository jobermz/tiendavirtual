package upc.epe.dao.tiendavirtual.mapper;

import java.util.List;
import upc.epe.dao.tiendavirtual.domain.Ventadet;
import upc.epe.dao.tiendavirtual.domain.VentadetKey;
import upc.epe.dao.tiendavirtual.domain.VentadetParamDef;

public interface VentadetMapper {
	
	public List<Ventadet> selectByDefaultParameter(VentadetParamDef ventadetParamDef);
	public Ventadet selectByPrimaryKey(VentadetKey ventadetKey);
	public int insertSelective(Ventadet ventadet);
	public int updateByPrimaryKeySelective(Ventadet ventadet);
	public int deleteByPrimaryKey(VentadetKey ventadetKey);
	
	public int lastSequence();

	
}
