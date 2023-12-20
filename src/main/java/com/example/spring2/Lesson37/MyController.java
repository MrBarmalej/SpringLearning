package com.example.spring2.Lesson37;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyBean myBean;

    @Autowired
    public MyController(MyBean myBean) {
        this.myBean = myBean;
    }

    @GetMapping("/hello")
    public String hello() {
        myBean.showMessage();
        return "Hello, World!";
    }
}



