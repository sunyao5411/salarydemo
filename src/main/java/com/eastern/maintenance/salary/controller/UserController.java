package com.eastern.maintenance.salary.controller;

import com.eastern.maintenance.salary.dao.UserDao;
import com.eastern.maintenance.salary.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/")
    public String getMsg() {
        return "hello";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user() {
        User user = userDao.findUserById("1");
        return user.getUser_name();
    }
}
