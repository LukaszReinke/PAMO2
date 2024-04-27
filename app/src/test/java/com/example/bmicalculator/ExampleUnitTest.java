package com.example.bmicalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testNormalBMI() {
        // Given
        double weight = 70; // kg
        double height = 1.75; // meters
        // When
        double result = BMICalculator.calculateBMI(weight, height);
        // Then
        assertEquals(22.86, result, 0.01);
    }

    @Test
    public void testExtremeBMI() {
        // Given
        double weight = 150; // kg
        double height = 1.75; // metry
        // When
        double result = BMICalculator.calculateBMI(weight, height);
        // Then

        assertEquals(48.98, result, 0.01);
    }

}