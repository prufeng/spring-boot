package com.feng.springboot.mybatis.annotation;

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
    private  StudentMapper studentMapper;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        System.out.println(studentMapper.findById((long)111));
        System.out.println(studentMapper.delete((long)111));
        System.out.println(studentMapper.insert((long)111, "name", 111));
        System.out.println(studentMapper.findById((long)111));
        System.out.println(studentMapper.update((long)111, "NAME", 1));
        System.out.println(studentMapper.findByName("%N%"));
    }
}
