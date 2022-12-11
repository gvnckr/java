package Ev_odevleri;

import java.util.Scanner;

public class dikdortgen {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int uzunk,kisak,yukseklik;

        System.out.println("lutfen uzun k giriniz");
        uzunk= scan.nextInt();
        System.out.println("lutfen kisa k giriniz");
        kisak=scan.nextInt();

        System.out.println("lutfen yukseklik giriniz");

        yukseklik=scan.nextInt();

        int a=uzunk;
        int b=kisak;
        int h=yukseklik;


        System.out.println("hacim ="+(a*a*h));

    }
}
