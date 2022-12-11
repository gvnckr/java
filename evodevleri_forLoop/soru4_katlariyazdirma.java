package evodevleri_forLoop;

import java.util.Scanner;

public class soru4_katlariyazdirma {
    public static void main(String[] args) {

    //kullanican  100 den kucuk bir sayi isteyin birden baslayarak 3 katlari seklinde yazirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (i%3==0){
                System.out.print(i +" ,");

            } else if (i%5==0) {
                System.out.print(i +",");

            }


        }
}
}