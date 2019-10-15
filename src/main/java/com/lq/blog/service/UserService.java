package com.lq.blog.service;

import com.lq.blog.po.User;

/**
 * @Author:liuqun
 * @Date:2019/9/25
 * @Description:com.lq.blog.service
 * @Version:1.0
 */
public interface UserService {
    User checkUser(String username,String password);

    User selectTest(Long id);
}
