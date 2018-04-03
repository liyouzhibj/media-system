package com.li.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.li.domain.model.TBizChannel;
import com.li.service.TBizChannelService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pengjl
 * @since 2018-03-25
 */
@Controller
public class TBizChannelController {

    @Resource
    private TBizChannelService channelService;

    @RequestMapping(value="/mini/getChannelList")
    @ResponseBody
    public Page queryChannelList(Integer currentPage)
    {
        Page page=new Page(currentPage,10);
        page.setOpenSort(true);
        List<String> list = new ArrayList<String>();
        list.add("sequenceNo");
        list.add("createTime");
        page.setDescs(list);
        Wrapper<TBizChannel> select = new EntityWrapper<TBizChannel>();
        select.where(" status = {0} ",1);
        select.where(" type = {0} ",1);

        page = channelService.selectPage(page,select);
        return page;
    }

    @RequestMapping(value="/mini/getChannelTopic")
    @ResponseBody
    public Page queryChannelTopic(Integer currentPage)
    {
        Page page=new Page(currentPage,10);
        page.setOpenSort(true);
        List<String> list = new ArrayList<String>();
        list.add("sequenceNo");
        list.add("createTime");
        page.setDescs(list);
        Wrapper<TBizChannel> select = new EntityWrapper<TBizChannel>();
        select.where(" status = {0} ",1);
        select.where(" type = {0} ",2);

        page = channelService.selectPage(page,select);
        return page;
    }
}

