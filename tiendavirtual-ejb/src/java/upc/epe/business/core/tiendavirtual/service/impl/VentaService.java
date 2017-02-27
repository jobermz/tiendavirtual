package upc.epe.business.core.tiendavirtual.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.apache.commons.beanutils.BeanUtils;
import upc.epe.business.core.tiendavirtual.dto.VentaDto;
import upc.epe.dao.tiendavirtual.domain.Venta;
import upc.epe.dao.tiendavirtual.domain.VentaParamDef;
import upc.epe.dao.tiendavirtual.domain.VentaParamDef.Criteria;
import upc.epe.dao.tiendavirtual.mapper.VentaMapper;
import upc.epe.business.core.tiendavirtual.service.VentaServiceLocal;
import upc.epe.business.core.tiendavirtual.util.MapperUtil;

@Stateless
public class VentaService implements VentaServiceLocal {
	
	private VentaMapper ventaMapper;
	public void TipousuarioService() {
            try {
              ventaMapper = MapperUtil.getSession().getMapper(VentaMapper.class);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
	public List<VentaDto> buscar(VentaDto ventaDto) throws Exception {
		VentaParamDef ventaParamDef		= new VentaParamDef();
		
		Criteria criteria		= ventaParamDef.createCriteria();
		if(ventaDto != null) {
			if(ventaDto.getTimFecha() != null) {
				criteria.andTimFechaEqualTo(ventaDto.getTimFecha());
			}
		}
		
		ventaParamDef.setOrderByClause("1");
		List<Venta>	 list	= ventaMapper.selectByDefaultParameter(ventaParamDef);
		
		List<VentaDto> listDto		= new ArrayList<VentaDto>();
		for(Venta venta:list) {
			ventaDto	= new VentaDto();
			BeanUtils.copyProperties(ventaDto, venta);
			listDto.add(ventaDto);
		}
		return listDto;
	}
	
	public VentaDto buscarById(VentaDto ventaDto) throws Exception {
		Venta venta		= new Venta();
		BeanUtils.copyProperties(venta, ventaDto);
		venta		= ventaMapper.selectByPrimaryKey(venta);
		VentaDto dto	= new VentaDto();
		BeanUtils.copyProperties(dto, venta);
		return dto;
	}
	
	public Integer guardar(VentaDto ventaDto) throws Exception {
		Venta venta		= new Venta();
		BeanUtils.copyProperties(venta, ventaDto);
		int rs	= 0;
		Venta exiteVenta		= ventaMapper.selectByPrimaryKey(venta);
		if(exiteVenta != null) {
			rs	= ventaMapper.updateByPrimaryKeySelective(venta);
		} else {
			rs	= ventaMapper.insertSelective(venta);
			
			Integer srlId	= ventaMapper.lastSequence();
			ventaDto.setSrlId(srlId);

		}
		return rs;
	}
	
	public Integer eliminar(VentaDto ventaDto) throws Exception {
		Venta venta		= new Venta();
		BeanUtils.copyProperties(venta, ventaDto);
		Integer rs	= ventaMapper.deleteByPrimaryKey(venta);
		return rs;
	}
	
}
