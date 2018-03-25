package com.li.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

/**
 * feignClient 用于调用user的服务，name是user系统的application.name,
 * @requestMapping 是user系统中 某个controller的路径
 */
@FeignClient(name="cloud-userCenter-service")
public interface UserService {

    @RequestMapping("/getUser.do")
    String getUserInfo(Integer id);
}
