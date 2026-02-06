package rongraksa.example;

public class FourHundredYearCheck {
    public static boolean isLeapYear(int year) {
        // Validate year range (1 - 9999)
        if (year < 1 || year > 9999) {
            return false;
        }

        // Calculation:
        // 1. Divisible by 4 AND NOT divisible by 100
        // OR
        // 2. Divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Method 2: Get the number of days in a specific month/year
    public static int getDaysInMonth(int month, int year) {
        // Validate month (1-12) and year (1-9999)
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        // Determine days based on month
        switch (month) {
            // Months with 31 days
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            // February (Check for Leap Year)
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

                // Months with 30 days
            case 4: case 6: case 9: case 11:
                return 30;

            default:
                return -1; // Should technically never be reached due to validation above
        }
    }
    public static void main(String[] args) {
        // Test cases for isLeapYear
        System.out.println(isLeapYear(2020)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2021)); // false

        // Test cases for getDaysInMonth
        System.out.println(getDaysInMonth(2, 2020)); // 29
        System.out.println(getDaysInMonth(2, 2019)); // 28
        System.out.println(getDaysInMonth(4, 2021)); // 30
        System.out.println(getDaysInMonth(1, 2021)); // 31
        System.out.println(getDaysInMonth(13, 2021)); // -1 (invalid month)
        System.out.println(getDaysInMonth(2, 10000)); // -1 (invalid year)
    }
}
