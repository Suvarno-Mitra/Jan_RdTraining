package com.example.dateandtimeapi;

public class Main {
    public static void main(String[] args) {
        // Demonstrate Period and Duration with LocalDate and LocalTime
        PeriodExample.showPeriodExample();
        DurationExample.showDurationExample();

        // Demonstrate other useful methods for manipulating dates and times
        LocalDateExample.showLocalDateExampleWithPeriod();
        LocalDateTimeExample.showLocalDateTimeWithPeriod();
        InstantExample.showInstantWithDuration();
    }
}
