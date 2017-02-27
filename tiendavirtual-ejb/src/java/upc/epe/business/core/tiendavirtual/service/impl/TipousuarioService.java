package upc.epe.business.core.tiendavirtual.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.apache.commons.beanutils.BeanUtils;
import upc.epe.business.core.tiendavirtual.dto.TipousuarioDto;
import upc.epe.dao.tiendavirtual.domain.Tipousuario;
import upc.epe.dao.tiendavirtual.domain.TipousuarioParamDef;
import upc.epe.dao.tiendavirtual.domain.TipousuarioParamDef.Criteria;
import upc.epe.dao.tiendavirtual.mapper.TipousuarioMapper;
import upc.epe.general.util.CadenaUtil;
import upc.epe.business.core.tiendavirtual.service.TipousuarioServiceLocal;
import upc.epe.business.core.tiendavirtual.util.MapperUtil;

@Stateless
public class TipousuarioService implements TipousuarioServiceLocal {
	
	private TipousuarioMapper tipousuarioMapper;
	public void TipousuarioService() {
            try {
              tipousuarioMapper = MapperUtil.getSession().getMapper(TipousuarioMapper.class);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
	public List<TipousuarioDto> buscar(TipousuarioDto tipousuarioDto) throws Exception {
		TipousuarioParamDef tipousuarioParamDef		= new TipousuarioParamDef();
		
		Criteria criteria		= tipousuarioParamDef.createCriteria();
		if(tipousuarioDto != null) {
			if(CadenaUtil.getStrNull(tipousuarioDto.getStrDescripcion()) != null) {
				criteria.andStrDescripcionLike(tipousuarioDto.getStrDescripcion());
			}
		}
		
		tipousuarioParamDef.setOrderByClause("1");
		List<Tipousuario>	 list	= tipousuarioMapper.selectByDefaultParameter(tipousuarioParamDef);
		
		List<TipousuarioDto> listDto		= new ArrayList<TipousuarioDto>();
		for(Tipousuario tipousuario:list) {
			tipousuarioDto	= new TipousuarioDto();
			BeanUtils.copyProperties(tipousuarioDto, tipousuario);
			listDto.add(tipousuarioDto);
		}
		return listDto;
	}
	
	public TipousuarioDto buscarById(TipousuarioDto tipousuarioDto) throws Exception {
		Tipousuario tipousuario		= new Tipousuario();
		BeanUtils.copyProperties(tipousuario, tipousuarioDto);
		tipousuario		= tipousuarioMapper.selectByPrimaryKey(tipousuario);
		TipousuarioDto dto	= new TipousuarioDto();
		BeanUtils.copyProperties(dto, tipousuario);
		return dto;
	}
	
	public Integer guardar(TipousuarioDto tipousuarioDto) throws Exception {
		Tipousuario tipousuario		= new Tipousuario();
		BeanUtils.copyProperties(tipousuario, tipousuarioDto);
		int rs	= 0;
		Tipousuario exiteTipousuario		= tipousuarioMapper.selectByPrimaryKey(tipousuario);
		if(exiteTipousuario != null) {
			rs	= tipousuarioMapper.updateByPrimaryKeySelective(tipousuario);
		} else {
			rs	= tipousuarioMapper.insertSelective(tipousuario);
			
			Integer srlId	= tipousuarioMapper.lastSequence();
			tipousuarioDto.setSrlId(srlId);

		}
		return rs;
	}
	
	public Integer eliminar(TipousuarioDto tipousuarioDto) throws Exception {
		Tipousuario tipousuario		= new Tipousuario();
		BeanUtils.copyProperties(tipousuario, tipousuarioDto);
		Integer rs	= tipousuarioMapper.deleteByPrimaryKey(tipousuario);
		return rs;
	}
	
}
