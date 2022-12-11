package evodevleri_forLoop;

import java.util.Scanner;

public class denem_10 {
    public static void main(String[] args) {
        //1den 10 a kadar olan cift sayilarin toplamini yazdirin


      int toplam=0;


        for (int i = 1; i <= 10; i++) {
            if (i%2==1){
            toplam+=i;
            }

        }


        System.out.println(toplam);

        }




    }

