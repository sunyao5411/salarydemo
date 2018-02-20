package com.eastern.maintenance.salary.controller;

import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@Path("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GET
    @Path("/")
    public String getMsg() {
        return "hello";
    }

    @GET
    @Path("/{userId}")
    public User getUserById(@PathVariable("userId") String userId) {
        if (StringUtils.isEmpty(userId)) {
            return null;
        }
        User user = userService.findById(userId);
        return user;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void AddUser(User user) {
        userService.create(user);
    }

    @DELETE
    @Path("/{userId}")
    public void removeUser(@PathParam("userId") String userId) {
        userService.remove(userId);
    }

    @GET
    @Path("/list")
    public List<User> queryAllUsers() {
        return userService.queryAll();
    }

}
