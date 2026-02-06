package rongraksa.example;

public class MinuteToYearCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        int year = (int) minutes / (365*24*60);
        int day = (int) (minutes % (365*24*60))/(24*60);
        // int hour =(int) (minutes % 365) / 60;
        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
    public static void main(String[] args) {
        printYearsAndDays(525600);
        System.out.println(365*24*60);
        System.out.println(24*60);
    }
}
