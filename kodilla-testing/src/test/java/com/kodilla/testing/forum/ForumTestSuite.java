package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUserName();
        System.out.println("Testing " + result);
        //Then
        assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        assertEquals("John Smith", result);
    }
}
