package com.jxust.community.service;

import com.jxust.community.dao.UserMapper;
import com.jxust.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sxtstart
 * @create 2020-01-10 14:46
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserByUserId(Integer id) {
        return userMapper.selectById(id);
    }
}
