package upc.epe.business.core.tiendavirtual.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.apache.commons.beanutils.BeanUtils;
import upc.epe.business.core.tiendavirtual.dto.UsuariosDto;
import upc.epe.dao.tiendavirtual.domain.Usuarios;
import upc.epe.dao.tiendavirtual.domain.UsuariosParamDef;
import upc.epe.dao.tiendavirtual.domain.UsuariosParamDef.Criteria;
import upc.epe.dao.tiendavirtual.mapper.UsuariosMapper;
import upc.epe.general.util.CadenaUtil;
import upc.epe.business.core.tiendavirtual.service.UsuariosServiceLocal;
import upc.epe.business.core.tiendavirtual.util.MapperUtil;

@Stateless
public class UsuariosService implements UsuariosServiceLocal {
	
	private UsuariosMapper usuariosMapper;
	public void TipousuarioService() {
            try {
              usuariosMapper = MapperUtil.getSession().getMapper(UsuariosMapper.class);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
	public List<UsuariosDto> buscar(UsuariosDto usuariosDto) throws Exception {
		UsuariosParamDef usuariosParamDef		= new UsuariosParamDef();
		
		Criteria criteria		= usuariosParamDef.createCriteria();
		if(usuariosDto != null) {
			if(CadenaUtil.getStrNull(usuariosDto.getStrLogin()) != null) {
				criteria.andStrLoginLike(usuariosDto.getStrLogin());
			}
			if(CadenaUtil.getStrNull(usuariosDto.getStrPassword()) != null) {
				criteria.andStrPasswordLike(usuariosDto.getStrPassword());
			}
			if(CadenaUtil.getStrNull(usuariosDto.getStrNombreCompleto()) != null) {
				criteria.andStrNombreCompletoLike(usuariosDto.getStrNombreCompleto());
			}
			if(CadenaUtil.getStrNull(usuariosDto.getStrEmail()) != null) {
				criteria.andStrEmailLike(usuariosDto.getStrEmail());
			}
		}
		
		usuariosParamDef.setOrderByClause("1");
		List<Usuarios>	 list	= usuariosMapper.selectByDefaultParameter(usuariosParamDef);
		
		List<UsuariosDto> listDto		= new ArrayList<UsuariosDto>();
		for(Usuarios usuarios:list) {
			usuariosDto	= new UsuariosDto();
			BeanUtils.copyProperties(usuariosDto, usuarios);
			listDto.add(usuariosDto);
		}
		return listDto;
	}
	
	public UsuariosDto buscarById(UsuariosDto usuariosDto) throws Exception {
		Usuarios usuarios		= new Usuarios();
		BeanUtils.copyProperties(usuarios, usuariosDto);
		usuarios		= usuariosMapper.selectByPrimaryKey(usuarios);
		UsuariosDto dto	= new UsuariosDto();
		BeanUtils.copyProperties(dto, usuarios);
		return dto;
	}
	
	public Integer guardar(UsuariosDto usuariosDto) throws Exception {
		Usuarios usuarios		= new Usuarios();
		BeanUtils.copyProperties(usuarios, usuariosDto);
		int rs	= 0;
		Usuarios exiteUsuarios		= usuariosMapper.selectByPrimaryKey(usuarios);
		if(exiteUsuarios != null) {
			rs	= usuariosMapper.updateByPrimaryKeySelective(usuarios);
		} else {
			rs	= usuariosMapper.insertSelective(usuarios);
			
			Integer srlId	= usuariosMapper.lastSequence();
			usuariosDto.setSrlId(srlId);

		}
		return rs;
	}
	
	public Integer eliminar(UsuariosDto usuariosDto) throws Exception {
		Usuarios usuarios		= new Usuarios();
		BeanUtils.copyProperties(usuarios, usuariosDto);
		Integer rs	= usuariosMapper.deleteByPrimaryKey(usuarios);
		return rs;
	}
	
}
