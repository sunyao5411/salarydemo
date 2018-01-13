package com.eastern.maintenance.salary.service;

import com.eastern.maintenance.salary.dao.UserDao;
import com.eastern.maintenance.salary.domain.User;
import com.eastern.maintenance.salary.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add(User user) {
        user.setUserId(IDGenerator.generateUniqueId());
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void remove(String userId) {
        userDao.remove(userId);
    }

    public User findById(String userId) {
        return this.userDao.findById(userId);
    }
}
