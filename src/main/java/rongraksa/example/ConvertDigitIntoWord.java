package rongraksa.example;

public class ConvertDigitIntoWord {
    public static int numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainder;
            StringBuilder nameNumber;
            while (number != 0) {
                remainder = number % 10;

                switch (remainder) {
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    default -> System.out.println("Zero");
                }
                number /= 10;

            }
        }
            return number;
        }

    public static void main(String[] args){
        numberToWords(-100);
    }

}
