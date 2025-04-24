package com.example.userservice;

public class UserService {

    public String getUserGreeting(String name) {
        return "Hello, " + name + "!";
    }

    public int getUserCount() {
        return 42;
    }
}
