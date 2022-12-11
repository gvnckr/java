package practisday3;

import java.util.Scanner;

public class day03_stringmani9 {

    public static void main(String[] args) {
// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan= new Scanner( System.in);

        System.out.println( "adnizi  soyadiniz giriniz\nisim");

        String isim= scan.next();
        System.out.println("soyisim");
        String soyisim= scan.next();

        if( isim.length()>soyisim.length()){
            System.out.println("isim soyisimden uzun");

        } else if (isim.length()==soyisim.length()) {
            System.out.println("isim soyisimle esit");

        }else System.out.println("soyisim isimden uzun");


    }
}
