package com.example.dateandtimeapi;

import java.time.Duration;
import java.time.LocalTime;

class DurationExample {
    public static void showDurationExample() {
        System.out.println("----- Duration Example -----");

        // Create a duration of 10 hours, 30 minutes
        Duration duration = Duration.ofHours(10).plusMinutes(30);
        System.out.println("Duration of 10 hours and 30 minutes: " + duration);

        // Add the duration to the current time
        LocalTime now = LocalTime.now();
        LocalTime futureTime = now.plus(duration);
        System.out.println("Time after adding the duration: " + futureTime);

        // Subtract the duration from the current time
        LocalTime pastTime = now.minus(duration);
        System.out.println("Time after subtracting the duration: " + pastTime);

        // Calculate the duration between two times
        LocalTime startTime = LocalTime.of(8, 0);
        LocalTime endTime = LocalTime.of(14, 30);
        Duration durationBetween = Duration.between(startTime, endTime);
        System.out.println("Duration between 08:00 and 14:30: " + durationBetween);
    }
}
