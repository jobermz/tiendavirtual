package upc.epe.dao.tiendavirtual.mapper;

import java.util.List;
import upc.epe.dao.tiendavirtual.domain.Videos;
import upc.epe.dao.tiendavirtual.domain.VideosKey;
import upc.epe.dao.tiendavirtual.domain.VideosParamDef;

public interface VideosMapper {
	
	public List<Videos> selectByDefaultParameter(VideosParamDef videosParamDef);
	public Videos selectByPrimaryKey(VideosKey videosKey);
	public int insertSelective(Videos videos);
	public int updateByPrimaryKeySelective(Videos videos);
	public int deleteByPrimaryKey(VideosKey videosKey);
	
	public int lastSequence();

	
}
