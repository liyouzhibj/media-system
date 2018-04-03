package com.li.controller;

import com.li.domain.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
//用来刷新的注解，如果不加上这个执行bus/refresh将不成功
@RefreshScope
public class TestController {

    /*@RequestMapping("/getUser.do")
    @ResponseBody
    public User test()
    {
        User user  = new User();
        user.setId(1);
        user.setUserName("111");
        user.setUserType(1);
        return user;
    }*/

    @Value("${aaa}")
    private String aaa;

    @RequestMapping("/hello")
    @ResponseBody
    public String from() {
        return this.aaa;
    }


}
