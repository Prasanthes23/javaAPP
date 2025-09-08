package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testHello() {
        assertEquals("Hello, Jenkins CI!", App.hello());
    }
}
