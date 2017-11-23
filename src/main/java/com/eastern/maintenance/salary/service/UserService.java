package com.eastern.maintenance.salary.service;

import com.eastern.maintenance.salary.dao.UserDao;
import com.eastern.maintenance.salary.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void removeUser(String userId) {
        userDao.removeUser(userId);
    }

    public User findUserById(String userId) {
        return this.userDao.findUserById(userId);
    }
}
