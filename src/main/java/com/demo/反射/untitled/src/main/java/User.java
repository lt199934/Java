package com.demo.反射.untitled.src.main.java;

public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public User() {

    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public  void yk(){
        System.out.println("User你好");
    }

}
