package com.eastern.maintenance.salary.controller;

import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String getMsg() {
        return "hello";
    }

    @RequestMapping("/user/{userId}")
    @ResponseBody
    public User getUserById(@PathVariable("userId") String userId) {
        User user = userService.findById(userId);
        return user;
    }

}
