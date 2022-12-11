package Ev_odevleri;

import java.util.Scanner;

public class ODEV {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("luften 1 sayi giriniz");

        int a,b;

          a= scan.nextInt();
        System.out.println("lutfen 2.sayıyı giriniz");
          b=scan.nextInt();


        System.out.println("girilen iki sayi toplamı =" +(a+b));

        System.out.println("iki sayinin farkı="+(a-b));
        System.out.println("iki sayinin carpimi"+(a*b));


    }
}
