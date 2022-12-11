package day23_arreyList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");
        Collections.sort(urunler);
        System.out.println(urunler);
        //List ile gelen sort methodunda siralam ozelligine girmek gerekiyor
        //bunun yerine collections methodunu kullaniyoruz bu method listemizi naturel ordere gore siralar
        //harf siralmasina gore  cay,cekirdek,ikram,nutella
    }
}
