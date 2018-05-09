package com.feng.springboot.mybatis.annotation;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by PanRufeng on 2018/5/9.
 */
@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student WHERE id = #{id}")
    Student findById(@Param("id") Long id);

    @Select("SELECT * FROM student WHERE name like #{name}")
    List<Student> findByName(@Param("name") String name);

    @Insert("INSERT INTO student VALUES( #{id}, #{name}, #{age})")
    boolean insert(@Param("id") long id, @Param("name") String name, @Param("age") int age);

    @Delete("DELETE FROM student WHERE id = #{id}")
    boolean delete(@Param("id") Long id);

    @Update("UPDATE student set name = #{name}, age = #{age} WHERE id  = #{id}")
    boolean update (@Param("id") long id, @Param("name") String name, @Param("age") int age);

}
