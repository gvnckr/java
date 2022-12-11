package day20_Arrays;

import java.util.Arrays;

public class C03_Lenght {
    public static void main(String[] args) {


        int sayilar []={1,2,3};            //iki sekilde array olusturlur
        String harfler[]=new String[4];

        System.out.println("sayilar arrayinin uzunlugu =" + sayilar.length);//3

          //string length () metodunda parantez var arrayde yok

        System.out.println("harfler arrayi uzunlugu ="+harfler.length);//4

        System.out.println(Arrays.toString(harfler));//null,null,null,null



        System.out.println(harfler[harfler.length-1]);// harfler arrai son elemtini yazdiralim

        System.out.println(harfler[5]);//uzunlugundan fazla yazdirmak istersek exception verir
    }
}
