package com.lq.blog.service;

import com.lq.blog.mapper.UserMapper;
import com.lq.blog.po.User;
import com.lq.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:liuqun
 * @Date:2019/9/25
 * @Description:com.lq.blog.service
 * @Version:1.0
 */

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        User user=this.userMapper.loginAdmin(username, MD5Utils.code(password));
        return user;
    }

    @Override
    public User selectTest(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
