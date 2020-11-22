package com.example.vuedemo.service;

import com.example.vuedemo.dao.UserDao;
import com.example.vuedemo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoServiceImp implements UserDaoService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findByUserName(String userName) {
        User user = userDao.findByUserName(userName);
        return user;
    }
}
