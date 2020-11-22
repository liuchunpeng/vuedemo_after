package com.example.vuedemo.service;

import com.example.vuedemo.entities.User;

public interface UserDaoService {
    User findByUserName(String userName);
}
