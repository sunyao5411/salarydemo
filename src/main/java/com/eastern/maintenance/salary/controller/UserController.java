package com.eastern.maintenance.salary.controller;

import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String getMsg() {
        return "hello";
    }

    @RequestMapping("/{userId}")
    @ResponseBody
    public User getUserById(@PathVariable("userId") String userId) {
        User user = userService.findById(userId);
        return user;
    }

    @RequestMapping("/")
    public void AddUser(@PathParam("user") User user) {
        userService.add(user);
    }

    @RequestMapping("/{userId}")
    public void removeUser(@PathVariable("userId") String userId) {
        userService.remove(userId);
    }

}
