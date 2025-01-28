package com.example.dateandtimeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

class PeriodExample {
    public static void showPeriodExample() {
        System.out.println("----- Period Example -----");

        // Create a period of 2 years, 5 months, and 10 days
        Period period = Period.of(2, 5, 10);
        System.out.println("Period of 2 years, 5 months, and 10 days: " + period);

        // Add the period to today's date
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plus(period);
        System.out.println("Date after adding the period: " + futureDate);

        // Subtract the period from today's date
        LocalDate pastDate = today.minus(period);
        System.out.println("Date after subtracting the period: " + pastDate);

        // Calculate the period between two dates
        LocalDate startDate = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2025, Month.JANUARY, 1);
        Period periodBetween = Period.between(startDate, endDate);
        System.out.println("Period between 2020-01-01 and 2025-01-01: " + periodBetween);
    }
}