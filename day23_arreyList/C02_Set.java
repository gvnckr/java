package day23_arreyList;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        //elimizde urunlerin bulundugu bir liste var listedeki urun listesindeki istenen siradaki
        // urunu yenisiyle degistirip eski urunu var olan eski urunler listesine ekleyelim
        List<String>urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");
        List<String>eskiurunler=new ArrayList<>();
        //listedeki ikramin yerine biskrem koyalim ikrami da eski urunler listesine ekleyelim

        String yeniurun="biskrem";
        String silinecekurun="ikram";

       int temp= urunler.indexOf(silinecekurun);
      String silinenurun =urunler.set(temp,yeniurun);
      eskiurunler.add(silinenurun);
        System.out.println("liste ="+urunler);
        System.out.println("eski urunler listesi ="+eskiurunler);


    }
}
