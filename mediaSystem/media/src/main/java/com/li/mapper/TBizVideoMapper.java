package com.li.mapper;

import com.li.domain.model.Content;
import com.li.domain.model.TBizVideo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author pengjl
 * @since 2018-03-25
 */
@Component
@Mapper
public interface TBizVideoMapper extends BaseMapper<TBizVideo> {

    List<Content> queryByChannel(Map<String, Object> map);
}
