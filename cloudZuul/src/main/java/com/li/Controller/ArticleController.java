package com.li.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {

    @RequestMapping("/getArticle.do")
    @ResponseBody
    public String getUserInfo()
    {
        return "111";
    }
}
