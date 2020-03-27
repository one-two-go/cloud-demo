package com.zhanggm.springcloud.user.controller;

import com.zhanggm.springcloud.user.pojo.User;
import com.zhanggm.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUserNameById")
    public String getUserNameById(@RequestParam("id") Integer id){
//        User user = userService.getUserById(1);
        return "张三";
    }
}
