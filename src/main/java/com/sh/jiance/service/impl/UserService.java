package com.sh.jiance.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sh.jiance.mapper.UserMapper;
import com.sh.jiance.model.User;
import com.sh.jiance.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

}