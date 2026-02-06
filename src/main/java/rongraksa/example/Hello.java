package rongraksa.example;

public class Hello {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(1000);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes=kiloBytes/1024;
        int remainKiloByte=kiloBytes%1024;
        if(kiloBytes<0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kiloBytes + " KB = "+ megaBytes + " MB and "+ remainKiloByte+" KB");
    }

}