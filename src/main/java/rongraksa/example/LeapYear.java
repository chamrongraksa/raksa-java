package rongraksa.example;

    public class LeapYear {
        // write code here
        public static boolean isLeapYear(int year){
            if(year<=1 || year>=9999){
                return false;
            }else if(year%4==00){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }
            else{
                return false;
            }
        }
        public static void main(String[] args) {
            System.out.println(isLeapYear(2022));
        }
    }


