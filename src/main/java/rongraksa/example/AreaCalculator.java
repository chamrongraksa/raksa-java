package rongraksa.example;

public class AreaCalculator {
    public static double area(double raduis){
        if(raduis<0){
            return -1.0;
        }
        return Math.pow(raduis,2)*Math.PI;
    }
    public static double area(double x, double y){
        if(x<0 || y<0){
            return -1.0;
        }
        return x*y;
    }
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }
}
