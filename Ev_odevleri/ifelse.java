package Ev_odevleri;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        // Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir not giriniz");

        double not=scan.nextDouble();

        if (not<0 || not>100) {

            System.out.println("lutfen gecerli bir not giriniz");
        } else if (not<50) {
            System.out.println("D");
            
        } else if (not<60) {
            System.out.println("C");
            
        } else if (not<80) {
            System.out.println("B");
        }else {
            System.out.println("A");
        }



    }
}
