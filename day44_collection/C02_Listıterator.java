package day44_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_Listıterator {
    public static void main(String[] args) {
        //Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin

        // sondan basa gitmek icin once sona gitmek gerek

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println(liste);

        ListIterator li1=liste.listIterator();

        while (li1.hasNext()){//  yanda eeleman oldugu muddetce yana gec
            li1.next(); //ıterator sonda
        }
            //bu loop bizi sona goturur
while (li1.hasPrevious()){  // yaninda elaman var mi
    System.out.print(li1.previous()+" ");//yana kaydirir
}




    }
}
