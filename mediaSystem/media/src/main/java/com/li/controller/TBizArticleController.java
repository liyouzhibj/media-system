package com.li.controller;


import com.li.domain.model.TBizArticle;
import com.li.service.TBizArticleService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
public class TBizArticleController {

    @Resource
    private TBizArticleService articleService;

    @RequestMapping("/mini/queryArticle")
    @ResponseBody
    public List<TBizArticle> queryArticleList(Integer currentPage,Integer size,Integer channel,Integer type)
    {
        Integer start = (currentPage-1)*size;
        return articleService.queryByChannelId(channel,type,start,size);
    }
}

