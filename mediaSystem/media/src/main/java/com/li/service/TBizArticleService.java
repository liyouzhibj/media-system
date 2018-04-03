package com.li.service;

import com.li.domain.model.Content;
import com.li.domain.model.TBizArticle;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author pengjl
 * @since 2018-03-25
 */
public interface TBizArticleService extends IService<TBizArticle> {

    List<Content> queryByChannelId(Integer channel, Integer type, Integer start, Integer size);
}
