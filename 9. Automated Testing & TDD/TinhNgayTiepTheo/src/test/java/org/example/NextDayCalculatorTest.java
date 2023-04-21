package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest{
    @Test
    public void testNextDate1() {
//        LocalDate actual = LocalDate.now();
        LocalDate actual = LocalDate.of(2023,2,28);
        LocalDate expected = LocalDate.of(2023,3,1);
        assertEquals(expected, NextDayCalculator.nextDate(actual));
    }
    @Test
    public void testNextDate2() {
        LocalDate actual = LocalDate.now();
        LocalDate expected = LocalDate.of(2023,04,23);
        assertEquals(expected, NextDayCalculator.nextDate(actual));
    }
}