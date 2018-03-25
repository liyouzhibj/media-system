package com.li.controller;

import com.li.domain.model.Article;
import com.li.domain.model.User;
import com.li.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ArticleController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getArticle.do")
    @ResponseBody
    public Article test()
    {
        Article article  = new Article();
        article.setId(1);
        article.setContent("1212");
        article.setTitle("1212");
        return article;
    }

    @RequestMapping("/getUser.do")
    @ResponseBody
    public User getUser()
    {
       return userService.getUserInfo(1);
    }

}
