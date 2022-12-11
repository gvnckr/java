package day43_interfaces_iteratos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    public static void main(String[] args) {
        //listıterator ıterator interfacsinin child interfacesidir.
        // ama daha fazla methodu vardir


        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);
        Integer temp;
        ListIterator lit1=liste.listIterator();
             while (lit1.hasNext()){
             temp=(Integer) lit1.next()+3;

             lit1.set(temp);

//lit1.set((Integer)lit1.next()+3);

    }
        System.out.println(liste);

    }
}
