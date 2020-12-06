package com.example.vuedemo.controller;

import com.example.vuedemo.dao.UserDao;
import com.example.vuedemo.entities.User;
import com.example.vuedemo.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SignInController {

    @Autowired
    private UserDaoService userDaoService;

    @PostMapping("/signIn")
    public Map signIn(@RequestBody User user){
        Map<String,Object> result =new HashMap<String, Object>();

        User res = userDaoService.findByUserName(user.getUserName());
        if (!ObjectUtils.isEmpty(res) && !StringUtils.isEmpty(user.getUserName()) && !StringUtils.isEmpty(user.getPassWord())){
            if (user.getUserName().equals(user.getUserName()) && user.getPassWord().equals(user.getPassWord())){

                result.put("code","0");
                result.put("data",res);
                return result;
            }
        }

        result.put("code","1");
        result.put("msg","用户名或密码错误");
        return result;
    }
    @GetMapping("/signOut")
    public String signOut(){
        return "redirect:/login";
    }
}
