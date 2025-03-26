package com.zinoviev.java_tests.Basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstSimpleTest {

    @Test
    public void compare() {

        FirstSimple firstSimpleTest = new FirstSimple();
        int value = firstSimpleTest.compare(1, 0);

        Assertions.assertEquals(2, value);

    }

}
