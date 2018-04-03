package com.li.service;

import com.li.domain.model.Content;
import com.li.domain.model.TBizVideo;
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
public interface TBizVideoService extends IService<TBizVideo> {

    List<Content> queryByChannel(Integer channel, Integer start, Integer size);
}
