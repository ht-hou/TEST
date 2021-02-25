package com.ex.demo.service;

import com.ex.demo.pojo.User;

public interface UserService {

     User findUserById(String userId);

     boolean eq(User user);

     void inster(User user);

     User getUser(User user);
}
