package rongraksa.example;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {

        int original=number;
        int reverse=0;
        int remain;

        while (number!=0){
            remain=number%10;
            reverse=reverse*10+remain;
            number/=10;
        }
        return reverse == original;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(-1221));
    }
}
