package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    int save(User user);

    List<User> select();

    int delete(Integer id);
}
