package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/toHello")
    public String toHello(ModelMap modelMap){
        User user = new User();
        user.setName("wifi");
        user.setPassword("123456");
        user.setEmail("wifi_uncle@163.com");
        userRepository.save(user);
        List<User> users = userRepository.findAll();
        modelMap.put("users",users);
        return "helloBoot"; //渲染到前面模板名为helloBoot
    }

}
