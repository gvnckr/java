package practisday2;

import java.util.Scanner;

public class day02_kanbagisi {
    public static void main(String[] args) {
/*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 ve 50 kg den  agir ise kan bagisi yapabilir.
 */

        Scanner scan= new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println("kilonuzu kg olarak giriniz:");
       int kilo= scan.nextInt();


       if (yas>0&&yas<18){
           System.out.println("yasi 18 den kucuk olanlar kan bagisi yapamaz");
       } else if (yas>=18) {
           if (kilo<50){
               System.out.println("kan bagisi yapamazsiniz");
           } else if (kilo>=50&& kilo>=0) {
               System.out.println("kan bagisi yapabilirsiniz");

           } else {
               System.out.println("yanlis deger girdniz");

           }
       }


    }
}
