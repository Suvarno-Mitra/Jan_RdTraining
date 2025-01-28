package com.example.dateandtimeapi;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

class LocalDateTimeExample {
    public static void showLocalDateTimeWithPeriod() {
        System.out.println("----- LocalDateTime with Period Example -----");

        // Current LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        // Adding a period to the current DateTime
        Period periodToAdd = Period.of(1, 0, 10); // 1 year and 10 days
        LocalDateTime futureDateTime = now.plus(periodToAdd);
        System.out.println("Future DateTime (after adding period): " + futureDateTime);

        // Subtracting a period from the current DateTime
        Period periodToSubtract = Period.of(0, 6, 0); // 6 months
        LocalDateTime pastDateTime = now.minus(periodToSubtract);
        System.out.println("Past DateTime (after subtracting period): " + pastDateTime);

        // Calculate the difference between two LocalDateTime instances
        LocalDateTime earlier = LocalDateTime.of(2022, Month.JANUARY, 1, 10, 30);
        Period periodBetween = Period.between(earlier.toLocalDate(), now.toLocalDate());
        System.out.println("Period between two DateTimes: " + periodBetween);
    }
}
