package rongraksa.example;

public class ConvertDigitIntoWord {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if(number==0){
            System.out.println("Zero");
            return;
        }
            int reverse=reverse(number);
            int leadZero=getDigitCount(number)-getDigitCount(reverse);
            int remainder;
            while (reverse != 0) {
                remainder = reverse % 10;

                switch (remainder) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");

                }
                reverse /= 10;

            }
            for(int i=0;i<leadZero;i++){
                System.out.println("Zero");
            }
    }
    public static int reverse(int number){

        int sum=0;
        while(number!=0){
            sum=sum*10+number%10;
            number/=10;
        }
        return sum;
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }

        if(number==0){
            return 1;
        }
        int count=0;
        for(int i=1;i<=number;i=i*10){
            count++;

        }
        return count;
    }

    public static void main(String[] args){

        numberToWords(0);
        System.out.println(getDigitCount(-222));
    }

}
