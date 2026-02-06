package rongraksa.example;

public class ShareDigit {
    public static boolean hasSharedDigit(int a, int b){
        if((10>a || 99<a) || (10>b || 99<b)){
            return false;
        }


        while(a>0 || b>0){

           if(a/10==b/10 || a%10==b%10 || a%10==b/10 || a/10==b%10){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println((hasSharedDigit(12,13)));
    }
}
