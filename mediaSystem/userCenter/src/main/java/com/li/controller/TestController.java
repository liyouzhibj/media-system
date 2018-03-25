package com.li.controller;

import com.li.domain.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {

    @RequestMapping("/getUser.do")
    @ResponseBody
    public User test()
    {
        User user  = new User();
        user.setId(1);
        user.setUserName("111");
        user.setUserType(1);
        return user;
    }

}
