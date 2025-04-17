package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        // Input: Multiple vesting configurations
        List<Integer> yearsToVestList = List.of(4); // Example: Vest over 4 years
        List<Integer> monthsToVestList = List.of(1); // Example: Starts in January (partial year)
        List<Double> percentagePerYearList = List.of(25.0); // Example: 25% vesting per year
        int option = 50; // Total option value to distribute

        // Aggregate unvested values for all configurations
        List<Integer> unvested = new ArrayList<>();

        // Iterate through each configuration
        for (int configIndex = 0; configIndex < yearsToVestList.size(); configIndex++) {
            int yearsToVest = yearsToVestList.get(configIndex);
            int monthsToVest = monthsToVestList.get(configIndex);
            double percentagePerYear = percentagePerYearList.get(configIndex);

            // Expand vesting data for this configuration
            List<Integer> vestYear = new ArrayList<>();
            List<Integer> vestMonth = new ArrayList<>();
            List<Double> percentage = new ArrayList<>();

            // Populate vestYear, vestMonth, and percentage for this configuration
            for (int year = 0; year < yearsToVest; year++) {
                vestYear.add(2025 + year); // Assuming vesting starts in 2025
                vestMonth.add(monthsToVest); // Keep the same month
                percentage.add(percentagePerYear); // Keep the same percentage
            }

            // Calculate unvested values ensuring total matches option for this configuration
            int remainingOption = option;
            int totalCalculated = 0; // Track the total calculated unvested values for this configuration

            for (int i = 0; i < vestYear.size(); i++) {
                double vestingPercentage = percentage.get(i);
                int unvestedValue;

                // Calculate unvested value for full years
                unvestedValue = (int) Math.floor((vestingPercentage / 100) * option);
                remainingOption -= unvestedValue;
                totalCalculated += unvestedValue;
                if (unvestedValue >= 0) {
                    unvested.add(unvestedValue);
                }
            }

            // Handle partial year based on monthsToVest
            if (monthsToVest > 0 && monthsToVest < 12) {
                int partialYearValue = (int) Math.floor((monthsToVest / 12.0) * option);
                remainingOption -= partialYearValue;
                totalCalculated += partialYearValue;
                if (partialYearValue >= 0) {
                    unvested.add(partialYearValue);
                }
            }

            // Adjust the last unvested value to account for rounding errors
            if (totalCalculated < option) {
                int adjustment = option - totalCalculated;
                int lastIndex = unvested.size() - 1;
                unvested.set(lastIndex, unvested.get(lastIndex) + adjustment);
            }
        }

        // Output results
        System.out.println("Unvested values: " + unvested);

        // Verify total unvested value for all configurations matches expectations
        int totalUnvested = unvested.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total Unvested: " + totalUnvested);
    }
}
