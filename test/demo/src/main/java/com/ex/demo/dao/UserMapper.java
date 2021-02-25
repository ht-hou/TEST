package com.ex.demo.dao;

import com.ex.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUser(String userName);

    void insert(User user);

    void update(User user);

    User findUserById(String userId);
}
