package upc.epe.business.core.tiendavirtual.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.apache.commons.beanutils.BeanUtils;
import upc.epe.business.core.tiendavirtual.dto.VentadetDto;
import upc.epe.dao.tiendavirtual.domain.Ventadet;
import upc.epe.dao.tiendavirtual.domain.VentadetParamDef;
import upc.epe.dao.tiendavirtual.domain.VentadetParamDef.Criteria;
import upc.epe.dao.tiendavirtual.mapper.VentadetMapper;
import upc.epe.general.util.CadenaUtil;
import upc.epe.business.core.tiendavirtual.service.VentadetServiceLocal;
import upc.epe.business.core.tiendavirtual.util.MapperUtil;

@Stateless
public class VentadetService implements VentadetServiceLocal {
	
	private VentadetMapper ventadetMapper;
	public void TipousuarioService() {
            try {
              ventadetMapper = MapperUtil.getSession().getMapper(VentadetMapper.class);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
	public List<VentadetDto> buscar(VentadetDto ventadetDto) throws Exception {
		VentadetParamDef ventadetParamDef		= new VentadetParamDef();
		
		Criteria criteria		= ventadetParamDef.createCriteria();
		if(ventadetDto != null) {
			if(CadenaUtil.getInteNull(ventadetDto.getIntCantidad()) != null) {
				criteria.andIntCantidadEqualTo(ventadetDto.getIntCantidad());
			}
			if(ventadetDto.getTimFecha() != null) {
				criteria.andTimFechaEqualTo(ventadetDto.getTimFecha());
			}
		}
		
		ventadetParamDef.setOrderByClause("1");
		List<Ventadet>	 list	= ventadetMapper.selectByDefaultParameter(ventadetParamDef);
		
		List<VentadetDto> listDto		= new ArrayList<VentadetDto>();
		for(Ventadet ventadet:list) {
			ventadetDto	= new VentadetDto();
			BeanUtils.copyProperties(ventadetDto, ventadet);
			listDto.add(ventadetDto);
		}
		return listDto;
	}
	
	public VentadetDto buscarById(VentadetDto ventadetDto) throws Exception {
		Ventadet ventadet		= new Ventadet();
		BeanUtils.copyProperties(ventadet, ventadetDto);
		ventadet		= ventadetMapper.selectByPrimaryKey(ventadet);
		VentadetDto dto	= new VentadetDto();
		BeanUtils.copyProperties(dto, ventadet);
		return dto;
	}
	
	public Integer guardar(VentadetDto ventadetDto) throws Exception {
		Ventadet ventadet		= new Ventadet();
		BeanUtils.copyProperties(ventadet, ventadetDto);
		int rs	= 0;
		Ventadet exiteVentadet		= ventadetMapper.selectByPrimaryKey(ventadet);
		if(exiteVentadet != null) {
			rs	= ventadetMapper.updateByPrimaryKeySelective(ventadet);
		} else {
			rs	= ventadetMapper.insertSelective(ventadet);
			
			Integer srlId	= ventadetMapper.lastSequence();
			ventadetDto.setSrlId(srlId);

		}
		return rs;
	}
	
	public Integer eliminar(VentadetDto ventadetDto) throws Exception {
		Ventadet ventadet		= new Ventadet();
		BeanUtils.copyProperties(ventadet, ventadetDto);
		Integer rs	= ventadetMapper.deleteByPrimaryKey(ventadet);
		return rs;
	}
	
}
