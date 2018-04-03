package com.li.service.impl;

import com.li.domain.model.Content;
import com.li.domain.model.TBizAlbum;
import com.li.mapper.TBizAlbumMapper;
import com.li.service.TBizAlbumService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pengjl
 * @since 2018-03-25
 */
@Service("albumService")
public class TBizAlbumServiceImpl extends ServiceImpl<TBizAlbumMapper, TBizAlbum> implements TBizAlbumService {

    @Resource
    private TBizAlbumMapper albumMapper;

    @Override
    public List<Content> queryByChannel(Integer channelId, Integer start, Integer size) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("channelId",channelId);
        map.put("start",start);
        map.put("size",size);
        return albumMapper.queryByChannel(map);
    }
}
