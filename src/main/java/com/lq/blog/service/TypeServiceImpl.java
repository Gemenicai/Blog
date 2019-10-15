package com.lq.blog.service;

import com.lq.blog.NotFoundException;
import com.lq.blog.mapper.TypeMapper;
import com.lq.blog.po.Type;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:liuqun
 * @Date:2019/10/9
 * @Description:com.lq.blog.service
 * @Version:1.0
 */
@Service
public class TypeServiceImpl implements TypeService{
    @Resource
    TypeMapper typeMapper;

    @Transactional
    @Override
    public int saveType(Type type) {
        return typeMapper.insert(type);
    }

    @Transactional
    @Override
    public Type GetType(Long id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    /*查出所有类型*/
    public List<Type> listType() {
        return typeMapper.selectAll();
    }

    @Transactional
    @Override
    public int updateType(Long id, Type type) {
        Type t=typeMapper.selectByPrimaryKey(id);
        if (t==null){
            throw new NotFoundException("不存在该类型");
        }
        BeanUtils.copyProperties(type,t);
        return typeMapper.insert(t);
    }

    @Transactional
    @Override
    public void deleteTYpe(Long id) {
        typeMapper.deleteByPrimaryKey(id);
    }
}
