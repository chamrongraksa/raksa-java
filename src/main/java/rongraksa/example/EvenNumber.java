package rongraksa.example;

public class EvenNumber {
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;

    }
    public static void main(String[] args){
        int start=5;
        int end=20;
        while(start<=end){
            if(isEvenNumber(start)){
                System.out.println("Even number "+start);


            }
            start++;

        }
    }
}
