package com.zinoviev.java_tests;

import com.zinoviev.java_tests.Basics.FirstSimple;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTestsApplication {

    public static void main(String[] args) {
        FirstSimple firstSimple = new FirstSimple();
        System.out.println(firstSimple.compare(1, 2));
    }

}
