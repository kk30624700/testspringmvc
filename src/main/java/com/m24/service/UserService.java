package com.m24.service;

import com.m24.bean.User;
import com.m24.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User getUser(Integer id) {
        return repository.getUser(id);
    }
}
