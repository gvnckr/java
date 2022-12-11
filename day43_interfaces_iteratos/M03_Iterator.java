package day43_interfaces_iteratos;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10,20,301]

// listedeki tum elementleri index kullanmadan 3 arttirin
        for (Integer each:liste
             ) {
            System.out.println(each+3 +" ");
            each+=3;
        }
        System.out.println("*********************************");

        System.out.println(liste);
    //java index yapisi olmayan collection lardaki elementlere ulasmak ve degistirmek
        // icin ıterator interfacesini olusturmustur.
        //ıterator interface oldugundan ondan obje uretmemiz mumkun degildir
        //bunun yerine bize ıteretor dondüren liste.ıterator  methodunun kullanuyoruz.


        // System.out.println(liste);/

        Iterator it1= liste.iterator();
        System.out.println(it1.next());//10 verir
        System.out.println(it1.next());//20 verir
        System.out.println(it1.next()); //30 verir
       // System.out.println(it1.next());30 dan sonra element kalmadigindan next methodu rte verir.
        // ıteratorde geri donus yok adim adim sona ulastiktan sonra basa gelmek isterseniz yeniden
        //bir itaretor olusturmak gerekir.


        //[10,20,30]
        Iterator it2=liste.iterator();
        // yeni ıterator kullanarak listenin tum elementlerini silelim.

        it2.next();//10 alir
        it2.remove();//10 siler
        System.out.println(liste);//[20,30]
        it2.next();//20 ekler
        it2.remove();//20 siler

        System.out.println(liste );//sadece 30 kaldi
        liste.add(10);
        liste.add(20);   //YENİ LİSTE
        liste.add(30);
        Iterator it3=liste.iterator();
        System.out.println("yeniden liste ="+liste);////[10,20,30]
        while (it3.hasNext()){
            it3.next();//10 alir
        it3.remove();//10 siler
    }

        System.out.println("looptan sonra ="+liste);//[]

        /*
        goruldugu gibi ıteratorde yaziriyoruz yada siliyoruz
        bu isimizi gormuyor
         */

        Iterator it4=liste.iterator();
        System.out.println(it4);

    }

}
