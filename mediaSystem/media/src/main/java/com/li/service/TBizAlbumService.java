package com.li.service;

import com.alibaba.druid.sql.visitor.functions.Concat;
import com.li.domain.model.Content;
import com.li.domain.model.TBizAlbum;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author pengjl
 * @since 2018-03-25
 */
public interface TBizAlbumService extends IService<TBizAlbum> {
    List<Content> queryByChannel(Integer channelId,Integer start,Integer size);
}
