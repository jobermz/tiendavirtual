package upc.epe.dao.tiendavirtual.mapper;

import java.util.List;
import upc.epe.dao.tiendavirtual.domain.Venta;
import upc.epe.dao.tiendavirtual.domain.VentaKey;
import upc.epe.dao.tiendavirtual.domain.VentaParamDef;

public interface VentaMapper {
	
	public List<Venta> selectByDefaultParameter(VentaParamDef ventaParamDef);
	public Venta selectByPrimaryKey(VentaKey ventaKey);
	public int insertSelective(Venta venta);
	public int updateByPrimaryKeySelective(Venta venta);
	public int deleteByPrimaryKey(VentaKey ventaKey);
	
	public int lastSequence();

	
}
