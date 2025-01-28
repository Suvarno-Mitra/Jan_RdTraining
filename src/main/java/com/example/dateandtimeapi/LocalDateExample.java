package com.example.dateandtimeapi;

import java.time.LocalDate;
import java.time.Period;

class LocalDateExample {
    public static void showLocalDateExampleWithPeriod() {
        System.out.println("----- LocalDate with Period Example -----");

        // Current date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // Adding a period (e.g., 2 years, 3 months, 15 days)
        Period periodToAdd = Period.of(2, 3, 15);
        LocalDate futureDate = today.plus(periodToAdd);
        System.out.println("Future Date (after adding period): " + futureDate);

        // Subtracting a period (e.g., 1 year, 2 months, 5 days)
        Period periodToSubtract = Period.of(1, 2, 5);
        LocalDate pastDate = today.minus(periodToSubtract);
        System.out.println("Past Date (after subtracting period): " + pastDate);

        // Compare two dates
        System.out.println("Is today after future date? " + today.isAfter(futureDate));
    }
}