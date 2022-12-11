package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrasy {
    public static void main(String[] args) {


        int sayilar[]=new int[3];

        System.out.println(Arrays.toString(sayilar));

        sayilar[2]=10;
        sayilar[0]=5;   //indeks degerlerine gore yazdirir
        sayilar[1]=3;
        System.out.println(Arrays.toString(sayilar));

    String siniflist[]={"ali" ,"ayse","ahmet"};
        System.out.println(Arrays.toString(siniflist));

        siniflist[1]="hasan";             //ayse yerine hasani alir

        System.out.println(Arrays.toString(siniflist));


        System.out.println(siniflist[1]);//sadece hasan yazdirmak istersek
        System.out.println(siniflist[0]);//ali yazirmak istersek

    }
}
