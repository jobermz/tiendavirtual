package upc.epe.business.core.tiendavirtual.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import org.apache.commons.beanutils.BeanUtils;
import upc.epe.business.core.tiendavirtual.dto.VideosDto;
import upc.epe.dao.tiendavirtual.domain.Videos;
import upc.epe.dao.tiendavirtual.domain.VideosParamDef;
import upc.epe.dao.tiendavirtual.domain.VideosParamDef.Criteria;
import upc.epe.dao.tiendavirtual.mapper.VideosMapper;
import upc.epe.general.util.CadenaUtil;
import upc.epe.business.core.tiendavirtual.service.VideosServiceLocal;
import upc.epe.business.core.tiendavirtual.util.MapperUtil;

@Stateless
public class VideosService implements VideosServiceLocal {
	
    private VideosMapper videosMapper;
    public VideosMapper getVideosMapper() {
        if(videosMapper == null) {
            try {
              videosMapper = MapperUtil.getSession().getMapper(VideosMapper.class);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return videosMapper;
    }
    public List<VideosDto> buscar(VideosDto videosDto) throws Exception {
        getVideosMapper();
        VideosParamDef videosParamDef		= new VideosParamDef();

        Criteria criteria		= videosParamDef.createCriteria();
        if(videosDto != null) {
            if(CadenaUtil.getStrNull(videosDto.getStrTitulo()) != null) {
                    criteria.andStrTituloLike(videosDto.getStrTitulo());
            }
            if(CadenaUtil.getStrNull(videosDto.getStrDescripcion()) != null) {
                    criteria.andStrDescripcionLike(videosDto.getStrDescripcion());
            }
            if(CadenaUtil.getStrNull(videosDto.getStrVarImagen()) != null) {
                    criteria.andStrVarImagenLike(videosDto.getStrVarImagen());
            }
        }

        videosParamDef.setOrderByClause("1");
        List<Videos>	 list	= videosMapper.selectByDefaultParameter(videosParamDef);

        List<VideosDto> listDto		= new ArrayList<VideosDto>();
        for(Videos videos:list) {
            videosDto	= new VideosDto();
            BeanUtils.copyProperties(videosDto, videos);
            listDto.add(videosDto);
        }
        return listDto;
    }
    
    public VideosDto buscarById(VideosDto videosDto) throws Exception {
        Videos videos		= new Videos();
        BeanUtils.copyProperties(videos, videosDto);
        videos		= videosMapper.selectByPrimaryKey(videos);
        VideosDto dto	= new VideosDto();
        BeanUtils.copyProperties(dto, videos);
        return dto;
    }

    public Integer guardar(VideosDto videosDto) throws Exception {
        Videos videos		= new Videos();
        BeanUtils.copyProperties(videos, videosDto);
        int rs	= 0;
        Videos exiteVideos		= videosMapper.selectByPrimaryKey(videos);
        if(exiteVideos != null) {
            rs	= videosMapper.updateByPrimaryKeySelective(videos);
        } else {
            rs	= videosMapper.insertSelective(videos);

            Integer srlId	= videosMapper.lastSequence();
            videosDto.setSrlId(srlId);
        }
        return rs;
    }
	
    public Integer eliminar(VideosDto videosDto) throws Exception {
        Videos videos		= new Videos();
        BeanUtils.copyProperties(videos, videosDto);
        Integer rs	= videosMapper.deleteByPrimaryKey(videos);
        return rs;
    }
	
}
