package day23_arreyList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


                //remove methodu 2 sekilde kullanilir
        //1 objeyi yazip silmesini istersek bize true yada false doner
        //index girersek o indexdeki elemani siler.
        System.out.println(urunler);
        System.out.println(urunler.remove("ikram"));//true
        System.out.println(urunler);//ikrami sildi

        //olmayan urun icin deneyelim
        System.out.println(urunler.remove("hobby"));//olmadigi icin false dondu yani silemedi

        //ikinci yontem yani index girelim

        System.out.println(urunler.remove(1));//indexi 1 olani silecek cekirdek
        System.out.println(urunler);//cekirdek olmayan list
        //olmayan bir urunu silmeye calisirsak

        System.out.println(urunler.remove(3)); //Index 3 out of bounds for length 2 verir


    }
}
