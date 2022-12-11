package day45_collections;

import java.util.ArrayList;
import java.util.List;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*

        List<String> list=new ArrayList();  //object olursa farkli data turleri eklenebilir
        list.add(5);
       list.add('s');
       list.add("ali");

   BU sekilde farkli data tipleri atanmaz
 */







        List<Object> list=new ArrayList();  //object olursa farkli data turleri eklenebilir
        list.add(5);
        list.add('s');
        list.add("ali");
        list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(2)+"CAN");

// COLLECTİONS elmas icerisindeki data türünü object secmeniz durumuda collectiona farkli data turunden objeler koymaniza izin verir
        //bu depolama acisindan kolaylik saglar ancak islem yaparken tum objeleri object
        // tanimladigimizdan cok fazla casting yapamamiz gerekbilir.
        System.out.println(list);


    }
}
