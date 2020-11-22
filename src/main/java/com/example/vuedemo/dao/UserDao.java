package com.example.vuedemo.dao;

import com.example.vuedemo.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao{
    User findByUserName(@Param("userName") String userName);
}
