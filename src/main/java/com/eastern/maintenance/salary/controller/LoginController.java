package com.eastern.maintenance.salary.controller;

import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@RestController
@Path("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * TODO 此处的密码需要加密，数据库中的密码也不能是明文形式
     * @param userName
     * @param password
     * @return
     */
    @POST
    public boolean login(@FormParam("username") String userName, @FormParam("password") String password) {
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            return false;
        }
        List<User> users = userService.queryAll();
        for (User user : users) {
            if (StringUtils.equals(user.getUserName(), userName) && StringUtils.equals(user.getPassword(), password)) {
                return true;
            }
        }
        return false;
    }
}
