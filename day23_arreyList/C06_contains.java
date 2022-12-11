package day23_arreyList;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        System.out.println(urunler.contains("nutella"));//true

        List<String> urunler2=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");

        System.out.println(urunler.containsAll(urunler2));//true
        urunler2.add("hobby");
        System.out.println(urunler.containsAll(urunler2));//false




    }
}
