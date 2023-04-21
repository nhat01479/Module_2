package org.example;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void translateFizzBuzz9() {
        int num = 9;
        String actual = FizzBuzzTranslate.translateFizzBuzz(num);
        String expected = "Fizz";
    }

    @org.junit.jupiter.api.Test
    void translateFizzBuzz10() {
        int num = 10;
        String actual = FizzBuzzTranslate.translateFizzBuzz(num);
        String expected = "Buzz";
    }
    @org.junit.jupiter.api.Test
    void translateFizzBuzz15() {
        int num = 15;
        String actual = FizzBuzzTranslate.translateFizzBuzz(num);
        String expected = "FizzBuzz";
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void translateFizzBuzz53() {
        int num = 53;
        String actual = FizzBuzzTranslate.translateFizzBuzz(num);
        String expected = "FizzBuzz";
        assertEquals(expected, actual);
    }
}