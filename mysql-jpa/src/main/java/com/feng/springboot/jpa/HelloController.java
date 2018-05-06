package com.feng.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(path="/student")
public class HelloController {
    @Autowired
    StudentRepository studentRepository;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Student greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Student stu = new Student();
        stu.setAge(100);
        stu.setId(counter.incrementAndGet());
        stu.setName(String.format(template, name));
        return stu;
    }

    @GetMapping("/add")
    public String addNewStudent(@RequestParam Integer id, @RequestParam String name, @RequestParam Integer age) {
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        stu.setId(id);
        studentRepository.save(stu);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Student> getAllUsers() {
        // This returns a JSON or XML with the users
        return studentRepository.findAll();
    }

}