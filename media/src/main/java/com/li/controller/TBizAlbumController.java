package com.li.controller;


import com.li.domain.model.TBizAlbum;
import com.li.service.TBizAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pengjl
 * @since 2018-03-25
 */
@Controller
@RequestMapping("/tBizAlbum")
public class TBizAlbumController {

    @Resource
    TBizAlbumService albumService;

    @RequestMapping("/test")
    @ResponseBody
    public String getAlbum()
    {
        TBizAlbum album = new TBizAlbum();
        album.setName("111");
        albumService.insert(album);
        return "success";
    }
}

