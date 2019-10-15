package com.lq.blog.web;

import com.lq.blog.NotFoundException;
import com.lq.blog.po.User;
import com.lq.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:liuqun
 * @Date:2019/9/20
 * @Description:com.lq.blog.web
 * @Version:1.0
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(){
//        int i=9/0;
//        String blog=null;
//        if(blog==null){
//            throw new NotFoundException("博客不存在");
//        }
//        System.out.println("------index-------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("{id}")
    @ResponseBody
    public User GetJsonUser(@PathVariable("id")Long id){
        return this.userService.selectTest(id);
    }
}
