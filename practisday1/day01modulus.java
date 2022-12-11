package practisday1;

import java.util.Scanner;

public class day01modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("5 basamakli sayi giriniz");
        int num= scan.nextInt();
        int ilkiki=num/1000;//ilk iki sayi  12
        int soniki=num%100; //100 e bolumunden kalani al 45
        int ilkikitoplam=(ilkiki/10)+(ilkiki%10);
        int sonikitoplam=(soniki/10)+(soniki%10);
        System.out.println("sayilar toplami: "+(ilkikitoplam+sonikitoplam));





    }
}
