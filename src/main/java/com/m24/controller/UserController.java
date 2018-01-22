package com.m24.controller;

import com.m24.bean.User;
import com.m24.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/{id}")
    public @ResponseBody User getUser(@PathVariable Integer id) {
        return service.getUser(id);
    }
}
