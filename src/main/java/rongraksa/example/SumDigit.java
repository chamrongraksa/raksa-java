package rongraksa.example;

public class SumDigit {
    public static int sumDigits(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        int remain=0;


        while(number>9) {
            remain=number%10;
            sum=sum+remain;
            number=number/10;

        }
        sum+=number;

        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumDigits(5));

    }
}
