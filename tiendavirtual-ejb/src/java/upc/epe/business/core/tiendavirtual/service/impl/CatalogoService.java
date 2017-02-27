package upc.epe.business.core.tiendavirtual.service.impl;

import com.sun.faces.mgbean.BeanBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.apache.commons.beanutils.BeanUtils;
import upc.epe.business.core.tiendavirtual.dto.CatalogoDto;
import upc.epe.dao.tiendavirtual.domain.Catalogo;
import upc.epe.dao.tiendavirtual.domain.CatalogoParamDef;
import upc.epe.dao.tiendavirtual.domain.CatalogoParamDef.Criteria;
import upc.epe.dao.tiendavirtual.mapper.CatalogoMapper;
import upc.epe.general.util.CadenaUtil;
import upc.epe.business.core.tiendavirtual.service.CatalogoServiceLocal;
import upc.epe.business.core.tiendavirtual.util.MapperUtil;

@Stateless
public class CatalogoService implements CatalogoServiceLocal {
	
	private CatalogoMapper catalogoMapper;
        public void CatalogoService() {
            try {
              catalogoMapper = MapperUtil.getSession().getMapper(CatalogoMapper.class);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
	public List<CatalogoDto> buscar(CatalogoDto catalogoDto) throws Exception {
		CatalogoParamDef catalogoParamDef		= new CatalogoParamDef();
		
		Criteria criteria		= catalogoParamDef.createCriteria();
		if(catalogoDto != null) {
			if(CadenaUtil.getStrNull(catalogoDto.getStrDescripcion()) != null) {
				criteria.andStrDescripcionLike(catalogoDto.getStrDescripcion());
			}
		}
		
		catalogoParamDef.setOrderByClause("1");
		List<Catalogo>	 list	= catalogoMapper.selectByDefaultParameter(catalogoParamDef);
		
		List<CatalogoDto> listDto		= new ArrayList<CatalogoDto>();
		for(Catalogo catalogo:list) {
			catalogoDto	= new CatalogoDto();
			BeanUtils.copyProperties(catalogoDto, catalogo);
			listDto.add(catalogoDto);
		}
		return listDto;
	}
	
	public CatalogoDto buscarById(CatalogoDto catalogoDto) throws Exception {
		Catalogo catalogo		= new Catalogo();
		BeanUtils.copyProperties(catalogo, catalogoDto);
		catalogo		= catalogoMapper.selectByPrimaryKey(catalogo);
		CatalogoDto dto	= new CatalogoDto();
		BeanUtils.copyProperties(dto, catalogo);
		return dto;
	}
	
	public Integer guardar(CatalogoDto catalogoDto) throws Exception {
		Catalogo catalogo		= new Catalogo();
		BeanUtils.copyProperties(catalogo, catalogoDto);
		int rs	= 0;
		Catalogo exiteCatalogo		= catalogoMapper.selectByPrimaryKey(catalogo);
		if(exiteCatalogo != null) {
			rs	= catalogoMapper.updateByPrimaryKeySelective(catalogo);
		} else {
			rs	= catalogoMapper.insertSelective(catalogo);
			
			Integer srlId	= catalogoMapper.lastSequence();
			catalogoDto.setSrlId(srlId);

		}
		return rs;
	}
	
	public Integer eliminar(CatalogoDto catalogoDto) throws Exception {
		Catalogo catalogo		= new Catalogo();
		BeanUtils.copyProperties(catalogo, catalogoDto);
		Integer rs	= catalogoMapper.deleteByPrimaryKey(catalogo);
		return rs;
	}
	
}
