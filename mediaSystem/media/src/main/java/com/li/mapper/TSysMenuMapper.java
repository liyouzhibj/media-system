package com.li.mapper;

import com.li.domain.model.TSysMenu;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

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
public interface TSysMenuMapper extends BaseMapper<TSysMenu> {

}
