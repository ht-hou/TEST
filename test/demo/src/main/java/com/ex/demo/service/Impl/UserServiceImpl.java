package com.ex.demo.service.Impl;

import com.ex.demo.common.JwtUtil;
import com.ex.demo.common.MD5;
import com.ex.demo.dao.UserMapper;
import com.ex.demo.pojo.User;
import com.ex.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Transactional
    @Override
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }
    @Transactional
    @Override
    public User getUser(User user) {
        String userName = user.getUserName();
        User user1 = userMapper.getUser(userName);
        return user1;

    }
    @Transactional
    @Override
    public boolean eq(User user) {
        String password = user.getUserPwd();
        User userDb = getUser(user);
        try {
            String md5 = MD5.md5(password);
            boolean result = md5.equals(userDb.getUserPwd());
            if (result) {
                User sign = JwtUtil.sign(userDb);
                update(sign);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    @Transactional
    @Override
    public void inster(User user) {
        String password = user.getUserPwd();
        try {
            String md5 = MD5.md5(password);
            user.setUserPwd(md5);
            userMapper.insert(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Transactional
    public void update(User user) {
        userMapper.update(user);
    }
}
