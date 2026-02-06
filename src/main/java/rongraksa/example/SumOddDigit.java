package rongraksa.example;

public class SumOddDigit {
    public static int getSumOddDigit(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        while(number>0){
            if((number%10)%2!=0){
                sum=sum+number%10;
            }
            number/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(getSumOddDigit(567432543));
    }
}
