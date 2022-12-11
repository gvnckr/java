package day21_Arrays;

import javax.print.DocFlavor;

public class c02_Array_EnUuzunKısaKelime {
    public static void main(String[] args) {

       // Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[]isimler={"erdal","onur","mehmet","hayrullah","mihrican"};

        enUzunVeKisayiYazdir(isimler);

    }

    private static void enUzunVeKisayiYazdir(String[] isimler) {

        String enuzunkelime=isimler[0];
        String enkisakelime=isimler[0];
        for (int i = 1; i <isimler.length; i++) {
            if(isimler[i].length()>enuzunkelime.length()){
                enuzunkelime=isimler[i];
            }
            if (isimler[i].length()<enkisakelime.length()){
                enkisakelime=isimler[i];
            }
        }

        System.out.println("en uzun kelime= "+enuzunkelime);
        System.out.println( "en kisa kelime =" +enkisakelime);


    }
}
