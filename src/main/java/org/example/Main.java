package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Input: Define the range-based data
        int yearsToVest = 3; // Example: Vest over 4 years
        int monthsToVest = 1; // Example: Starts in January
        double percentagePerYear = 25.0; // Example: 25% per year
        int option = 50; // Total option value to distribute

        // Expand vesting data based on the range inputs
        List<Integer> vestYear = new ArrayList<>();
        List<Integer> vestMonth = new ArrayList<>();
        List<Double> percentage = new ArrayList<>();

        // Populate vestYear, vestMonth, and percentage
        for (int year = 0; year < yearsToVest; year++) {
            vestYear.add(2025 + year); // Assuming vesting starts in 2025
            vestMonth.add(monthsToVest); // Keep the same month
            percentage.add(percentagePerYear); // Keep the same percentage
        }

        // Calculate unvested values ensuring total matches option
        List<Integer> unvested = new ArrayList<>();
        int remainingOption = option;

        for (int i = 0; i < vestYear.size(); i++) {
            double vestingPercentage = percentage.get(i);
            int unvestedValue;

            // For the last year, ensure remaining options are assigned
            if (i == vestYear.size() - 1) {
                // The last year gets the remaining options
                unvestedValue = remainingOption;
            } else {
                // Calculate vesting value based on percentage
                unvestedValue = (int) Math.floor((vestingPercentage / 100) * option);
                remainingOption -= unvestedValue;
            }

            // If we have a fractional value due to monthsToVest, adjust for the final year
            if (i == vestYear.size() - 1 && remainingOption > 0) {
                unvestedValue += remainingOption;
            }

            unvested.add(unvestedValue);
        }

        // Output results
        for (int i = 0; i < vestYear.size(); i++) {
            System.out.println("Year: " + vestYear.get(i) +
                    ", Month: " + vestMonth.get(i) +
                    ", Percentage: " + percentage.get(i) +
                    ", Unvested: " + unvested.get(i));
        }
    }
}