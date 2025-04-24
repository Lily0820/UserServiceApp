package com.example.userservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @Test
    public void testGetUserGreeting() {
        UserService service = new UserService();
        assertEquals("Hello, Alice!", service.getUserGreeting("Alice"));
    }
}
