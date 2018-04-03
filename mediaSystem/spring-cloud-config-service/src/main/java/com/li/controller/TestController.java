package com.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Controller
public class TestController {

    @RequestMapping("/test.do")
    @ResponseBody
    public String test()
    {
        return "1111";
    }

}
