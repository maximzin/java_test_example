package com.zinoviev.java_tests.Basics;

import java.sql.Array;
import java.util.Arrays;

public class Patient {

    int leftEye;

    int rightEye;

    public Patient(int leftEye, int rightEye) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
    }

    public int[] selectGlasses() {
        if (this.leftEye < 0 && rightEye < 0) {
            return new int[leftEye];
        }
        else if (leftEye < 0 && rightEye > 0) {
            return new Patient(leftEye, 0);
        }
        else if (leftEye > 0 && rightEye < 0) {
            return new Patient(0, rightEye);
        }
        return new Patient(0, 0);
    }

}
