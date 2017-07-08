package com.springdatarest.demo;

import org.junit.Assert;

class PersonTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        Assert.assertEquals("test", "test");
    }

}