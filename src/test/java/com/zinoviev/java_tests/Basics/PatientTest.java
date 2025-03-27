package com.zinoviev.java_tests.Basics;

import org.junit.jupiter.api.Test;

class PatientTest {

    @Test
    void selectGlasses() {

        // Given

        int leftEye = 0;
        int rightEye = 0;

        // When

        Patient patient = new Patient(leftEye, rightEye);
        Gpatient.selectGlasses();


        // Then

    }
}