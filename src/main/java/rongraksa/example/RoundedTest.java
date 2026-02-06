package rongraksa.example;

public class RoundedTest {

    public static void main(String[] args){
        double a=4.645435;
        double b=4.645712;
        long c=Math.round(a*1000);
        long d=Math.round(b*1000);
        System.out.println(c);
        System.out.println(d);
    }
}
