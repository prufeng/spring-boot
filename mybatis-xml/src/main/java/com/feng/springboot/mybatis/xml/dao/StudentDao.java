package com.feng.springboot.mybatis.xml.dao;

import com.feng.springboot.mybatis.xml.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * Created by PanRufeng on 2018/5/10.
 */
@Component
public class StudentDao {
    private final SqlSession sqlSession;

    public StudentDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Student selectById(long id) {
        return this.sqlSession.selectOne("selectById", id);
    }

}
