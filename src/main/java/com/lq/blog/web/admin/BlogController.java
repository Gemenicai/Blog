package com.lq.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:liuqun
 * @Date:2019/10/1
 * @Description:com.lq.blog.web.admin
 * @Version:1.0
 */
@Controller
@RequestMapping("/admin")
public class BlogController {
    @GetMapping("/blogs")
    public String list(){
        return "admin/blogs";
    }

}
