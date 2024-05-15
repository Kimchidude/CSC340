package com.csc340.restapidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class RestAPIController {

    Map<Integer, Student> studentDatabase = new HashMap<>();

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "NoName") String name) {
        return "Hello, "+name;
    }

    public Object getAllStudents() {
        if(studentDatabase.isEmpty()){
            studentDatabase.put(1, new Student(id: 1, name:"sample1", major: "CSC", GPA: 3.86));
        }

        return studentDatabase.values();
    }

}
