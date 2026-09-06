package com.example.cicd_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingControllerTest {

    @Test
    void testGreeting() {

        String expected =
                "CI/CD Pipeline is Working Successfully!";

        String actual =
                "CI/CD Pipeline is Working Successfully!";

        assertEquals(expected, actual);
    }
}