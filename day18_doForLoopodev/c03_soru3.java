package day18_doForLoopodev;

import java.util.Scanner;

public interface c03_soru3 {
    public static void main(String[] args) {

         /*kullanıcan toplamak icin 500 e kadar sayi girmesini isteyin
          sayi 500 u gectiginde toplami ve girilen sayi adedini yazdirin
          */
         int sayilartop=0;
         int sayiadet=0;
         int sayi=0;
        Scanner scan= new Scanner(System.in);
      do {
          System.out.println( "lutfen pozitif sayi giriniz");
           sayi= scan.nextInt();
          sayilartop+=sayi;
          sayiadet++;





      }while (sayilartop<500);



        System.out.println("sayilar toplami =" +sayilartop + " girilen sayi adeti " +sayiadet);






    }
}
