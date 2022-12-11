package day24_arrayListforİcLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArreydenLİstOlusturma {
    public static void main(String[] args) {

        //icinde 200 tane 1000 den kucuk pozitif tamsayi olan bir list olusturun kullanicidan bir sayi isteyip
        //listede olup olmadigini kullaniciya yazalim


        Random rnd=new Random();
        int sayi=0;
        List<Integer>sayiListesi=new ArrayList<>();

        while (sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi));
            sayiListesi.add(sayi);
        }
        System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=1;

        Scanner scan=new Scanner(System.in);

        while (!bildiMi){ //bildimi==false

            System.out.println("lutfen bir sayi tahmininde bulunun");
            sayi= scan.nextInt();
            if (sayiListesi.contains(sayi)){

            System.out.println("tebrikler " + tahminSayisi+ "adet tahminde listeden bir sayi buldunuz");
            bildiMi=true;

        }else {
                System.out.println(tahminSayisi + "adet sayi soyledniz ama yok");
                tahminSayisi++;
            }




    }
}
}
