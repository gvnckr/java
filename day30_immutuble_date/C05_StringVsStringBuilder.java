package day30_immutuble_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {

/*
String mi yoksa stringBuilder mi daha hizlidir
Bunun icin bir string olusturup sonuna 1000 kere nokta ekleyelim
oncesi ve sonrasi zamani alip aradaki farki alalim
Ayni islemi strinBuilder icin de yapalim
 */

        LocalTime basalngic=LocalTime.now();


String str="Ahhhh Java";
        for (int i = 0; i <1000 ; i++) {
            str+=" .";

        }
        LocalTime bitis=LocalTime.now();
        System.out.println(basalngic);
        System.out.println(bitis);
        System.out.println("string zaman :" +(bitis.getNano()-basalngic.getNano()));


    }
}
