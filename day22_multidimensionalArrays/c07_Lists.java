package day22_multidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class c07_Lists {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();
        /*LİST primitiv data turlerini kabul etmez
        */
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);
        //sadece add kullanirsak java sona ekler
        sayilar.add(2,10);//indexi 2 olan yere 10 elementini ekle
        System.out.println(sayilar);  //add index element istedigimiz indexe yerlestirir
        //add methodu eski elementleri silmez yenisini ekler
    }
}
