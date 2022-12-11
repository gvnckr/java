package evodevleri_forLoop;

import java.util.Scanner;

public class soru9_degertoplamamethodu {

    public static void main(String[] args) {

       //kullanicidan iki sayi isteyin ve aradaki degerleri toplatan program yaziniz

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int sayi1= scan.nextInt();;
        int sayi2= scan.nextInt();

     arayitopla(sayi1,sayi2);

    }

    private static void arayitopla(int sayi1, int sayi2) {
        int toplam=0;

        if (sayi1<sayi2){
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;


            }
        }else {
            for (int i = sayi2; i <sayi1 ; i++) {
                toplam+=i;

                

            }
        }
        System.out.println(toplam);

    }


}



