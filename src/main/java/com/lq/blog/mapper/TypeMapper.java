package com.lq.blog.mapper;

import com.lq.blog.po.Type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Long id);

    List<Type> selectAll();

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}