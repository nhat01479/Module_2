package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class NextDayCalculator {
    public static LocalDate nextDate(LocalDate date) {
        return date.plusDays(1);
    }

}
