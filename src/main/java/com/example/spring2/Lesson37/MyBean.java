package com.example.spring2.Lesson37;

public class MyBean {
    private String message;

    public MyBean(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println("Message from MyBean: " + message);
    }
}
