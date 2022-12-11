package day17_nestedForLoopOdev;

import java.util.Scanner;

public class c03_ciftdegeryazdir {


    public static void main(String[] args) {
          //kullanicidan baslangic bitis degerleri alin ve aradaki cift sayilari yazdirin
        int toplam=0;
        Scanner scan =new Scanner(System.in);

        System.out.println("baslangic degeri giriniz");
        int bas=scan.nextInt();

        System.out.println("bitis giriniz");
        int bitis=scan.nextInt();

        while (bas<bitis){

            if (bas%2==0)
                System.out.println(bas);

            bas++;


        }





    }
}
