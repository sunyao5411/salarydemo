package com.eastern.maintenance.salary.dao;

import com.eastern.maintenance.salary.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    User findById(String userId);

    void update(User user);

    void remove(String userId);

    void add(User user);

}
