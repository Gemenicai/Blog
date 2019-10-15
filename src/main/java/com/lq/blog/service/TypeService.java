package com.lq.blog.service;

import com.lq.blog.po.Type;

import java.util.List;

/**
 * @Author:liuqun
 * @Date:2019/10/9
 * @Description:com.lq.blog.service
 * @Version:1.0
 */
public interface TypeService {
    int saveType(Type type);

    Type GetType(Long id);

    List<Type> listType();

    int updateType(Long id, Type type);

    void deleteTYpe(Long id);
}
