package com.feng.springboot.mybatis.xml.mapper;

import com.feng.springboot.mybatis.xml.domain.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by PanRufeng on 2018/5/15.
 */
@Mapper
public interface StudentMapper {
    Student selectById(long id);
}