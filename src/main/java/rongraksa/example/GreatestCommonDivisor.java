package rongraksa.example;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int min= Math.min(first, second);

        int i;
        int gcd=1;
        for(i=1;i<=min;i++){
            if(first%i==0 && second%i==0){
                gcd=i;
            }
        }

        return gcd;
    }

    //second method
    /*
        if(first<second){
            min=first;
            for(i=1;i<=min;i++){
                divided=min % i;
                if(divided==0 && second%i==0){
                    gcd=i;

                }
            }
        }else {
            min=second;
            for(i=1;i<=min;i++){
                divided=min % i;
                if(divided==0 && first%i==0){
                   gcd=i;
                }
            }
        }
    */
    public static void main(String[] args){
       System.out.println(getGreatestCommonDivisor(42,108));
    }

}
