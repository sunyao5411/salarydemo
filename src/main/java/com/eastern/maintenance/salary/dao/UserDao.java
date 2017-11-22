package com.eastern.maintenance.salary.dao;

import com.eastern.maintenance.salary.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from user where user_id = #{userId} ")
    User findUserById(@Param("userId") String userId);
}
