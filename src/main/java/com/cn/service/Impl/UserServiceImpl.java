package com.cn.service.Impl;

import com.cn.mapper.UserTMapper;
import com.cn.po.UserT;
import com.cn.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserTMapper userTMapper;

    @Override
    public UserT getUserById(int userId) {
        UserT userT = userTMapper.selectByPrimaryKey(userId);
        return userT;
    }
}
