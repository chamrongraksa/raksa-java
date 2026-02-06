package rongraksa.example;

public class ListAllFactor {
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        int divided;
        int i;
        for(i=1;i<=number;i++){
            divided=number % i;
            if(divided==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        printFactors(16);

    }
}
