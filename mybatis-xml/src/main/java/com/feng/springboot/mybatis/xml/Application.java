package com.feng.springboot.mybatis.xml;

import com.feng.springboot.mybatis.xml.dao.StudentDao;
import com.feng.springboot.mybatis.xml.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by PanRufeng on 2018/4/29.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentDao studentDao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        System.out.println(studentDao.selectById((long)111));
        System.out.println(studentMapper.selectById(111));
//        System.out.println(studentMapper.findById((long)111));
//        System.out.println(studentMapper.delete((long)111));
//        System.out.println(studentMapper.insert((long)111, "name", 111));
//        System.out.println(studentMapper.findById((long)111));
//        System.out.println(studentMapper.update((long)111, "NAME", 1));
//        System.out.println(studentMapper.findByName("%N%"));
    }
}
