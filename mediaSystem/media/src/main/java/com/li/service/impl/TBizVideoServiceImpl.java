package com.li.service.impl;

import com.li.domain.model.Content;
import com.li.domain.model.TBizVideo;
import com.li.mapper.TBizVideoMapper;
import com.li.service.TBizVideoService;
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
@Service
public class TBizVideoServiceImpl extends ServiceImpl<TBizVideoMapper, TBizVideo> implements TBizVideoService {

    @Resource
    private TBizVideoMapper videoMapper;

    @Override
    public List<Content> queryByChannel(Integer channel, Integer start, Integer size) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("channelId",channel);
        map.put("start",start);
        map.put("size",size);
        return videoMapper.queryByChannel(map);
    }
}
