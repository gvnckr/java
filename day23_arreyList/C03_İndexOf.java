package day23_arreyList;

import java.util.ArrayList;
import java.util.List;

public class C03_İndexOf {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram"));//1 getirir
        System.out.println(urunler);
        //İNDEXOF METHODU BİZE BİLGİ DONDUREN BİR METHODTUR LİSTEMİZİ DEGİSTİRMEZ

        System.out.println( urunler.lastIndexOf("ikram"));
        //indexof aramaya 0 dan baslar
        //lastindexof son indexten baslar
        //ikiside aranan indexi verir

        urunler.add("ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram"));//1
        System.out.println(urunler.lastIndexOf("ikram"));//4





    }
}
