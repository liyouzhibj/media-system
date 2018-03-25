package com.li.controller;


import com.li.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pengjl
 * @since 2018-03-25
 */
@Controller
@RequestMapping("/tSysUser")
public class TSysUserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser.do")
    @ResponseBody
    public String getUser()
    {
       return userService.getUserInfo(1);
    }
}

