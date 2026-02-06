package rongraksa.example;

public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c){

//        return ((13<=a  && a<=19) || (13<=b  && b<=19)  || (13<=c  && c<=19));
        return isTeen(a)||isTeen(b)||isTeen(c);
    }
    public static boolean isTeen(int d){
        return (d>=13 && d<=19);
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,9));
        System.out.println(isTeen(20));
    }
}
