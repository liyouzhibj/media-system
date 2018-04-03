package com.li.service.impl;

import com.li.domain.model.Content;
import com.li.domain.model.TBizArticle;
import com.li.mapper.TBizArticleMapper;
import com.li.service.TBizArticleService;
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
public class TBizArticleServiceImpl extends ServiceImpl<TBizArticleMapper, TBizArticle> implements TBizArticleService {

    @Resource
    private TBizArticleMapper articleMapper;

    @Override
    public List<Content> queryByChannelId(Integer channel, Integer type, Integer start, Integer size)
    {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("type",type);
        map.put("channelId",channel);
        map.put("specialId",channel);
        map.put("start",start);
        map.put("size",size);
        return articleMapper.queryByChannel(map);
    }
}
