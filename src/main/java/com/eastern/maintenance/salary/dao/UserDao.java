package com.eastern.maintenance.salary.dao;

import com.eastern.maintenance.salary.domain.User;

import java.util.List;

public interface UserDao {

    User findById(String userId);

    void update(User user);

    void remove(String userId);

    void add(User user);

    List<User> list();

}
