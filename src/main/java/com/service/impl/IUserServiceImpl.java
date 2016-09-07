package com.service.impl;

import com.dao.UserMapper;
import com.model.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by apple on 16/9/7.
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}
