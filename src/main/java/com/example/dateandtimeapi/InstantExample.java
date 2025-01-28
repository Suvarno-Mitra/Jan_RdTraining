package com.example.dateandtimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

class InstantExample {
    public static void showInstantWithDuration() {
        System.out.println("----- Instant with Duration Example -----");

        // Current instant (timestamp)
        Instant now = Instant.now();
        System.out.println("Current Instant: " + now);

        // Add a duration of 5000 seconds to the current instant
        Duration durationToAdd = Duration.ofSeconds(5000);
        Instant futureInstant = now.plus(durationToAdd);
        System.out.println("Instant after adding 5000 seconds: " + futureInstant);

        // Subtract a duration of 1000 seconds
        Duration durationToSubtract = Duration.ofSeconds(1000);
        Instant pastInstant = now.minus(durationToSubtract);
        System.out.println("Instant after subtracting 1000 seconds: " + pastInstant);

        // Convert Instant to LocalDateTime in UTC
        LocalDateTime dateTimeFromInstant = LocalDateTime.ofInstant(now, ZoneOffset.UTC);
        System.out.println("LocalDateTime from Instant (UTC): " + dateTimeFromInstant);

        // Calculate duration between two instants
        Instant startInstant = Instant.parse("2025-01-26T10:15:30.00Z");
        Duration durationBetweenInstants = Duration.between(startInstant, now);
        System.out.println("Duration between two Instants: " + durationBetweenInstants);
    }
}
