package day07_ifsatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ders_soru {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");

        char harf= scan.next().charAt(0);

     if (( harf>='a' &&  harf<='z') || (harf>='A'&& harf<='Z')){

         System.out.println("girilen karakter bir harf");

     } else {
         System.out.println("girilen karakter bir harf degil");
     }


    }
}
