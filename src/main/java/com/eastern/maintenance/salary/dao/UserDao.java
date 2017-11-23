package com.eastern.maintenance.salary.dao;

import com.eastern.maintenance.salary.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    User findUserById(String userId);

    void updateUser(User user);

    void removeUser(String userId);

    void addUser(User user);

}
