package rongraksa.example;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int firstDigit=0;
        int lastDigit=number%10;
        while(number>0){
            firstDigit=number%10;
            number/=10;
        }
        return lastDigit+firstDigit;

    }
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(32345));
    }

}
