package day21_Arrays;

import java.util.Arrays;

public class c08_bİnarySearch {

    //binarysearch methodu silralanmis arrayde aradigimiz elementin indexini dondurur

    //ya aradigimiz element yoksa?
    //Aradgimiz elemnt yoksa java hem olmadigini hemde olsaydi nerede olacagini bize dondurur
    //olmadigini ifade icin - kullanir olsaydi olacagini siralama vererek gosterir.
    //(string de indexof olmayan elemntler icin -1 donduruyordu)
    //VARSA İNDEX YOKSA -SIRA VERİR!!!!!!!!!!!!

    public static void main(String[] args) {

        int[]sayilar={3,7,15,4,27,10};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,4));//1
        System.out.println(Arrays.binarySearch(sayilar,15));//OLSAYDİ 7 DEN SONRA OLURDU 4
        System.out.println(Arrays.binarySearch(sayilar,6));//OLSAYDİ 5DEN SONRA OLURDU -3
        System.out.println(Arrays.binarySearch(sayilar,-100));//OLSAYDİ EN BASTA OLURDU İNDEX 0
    }
}
