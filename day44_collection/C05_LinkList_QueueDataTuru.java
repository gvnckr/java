package day44_collection;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkList_QueueDataTuru {

    public static void main(String[] args) {


        Queue<String> ll3=new LinkedList<>();
        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("kadir");
        ll3.add("polat");
        //queue kuyruk demektir sira onemlidir gelen sona gelir giden bastan gider.

        System.out.println(ll3);//[adem, zeynep, kadir, polat]
        System.out.println("ll3.remove() = " + ll3.remove());//
        System.out.println(ll3);// ademi siler

        System.out.println("ll3.remove(\"polat\") = " + ll3.remove("polat"));//true
        System.out.println(ll3);// polatsiz liste

        System.out.println("ll3.element() = " + ll3.element());//basta kim varsa onu getirir ama silmez
        System.out.println("ll3.peek() = " + ll3.peek());

        Queue<String> ll4=new LinkedList<>();
        //System.out.println("ll4.element() = " + ll4.element());//NoSuchElementException
        System.out.println("ll3.peek() = " + ll3.peek());//null dondurur

        //peek element silmeden ilk elementi dondurur
        //aralarindaki fark bos liste olursa peek null döner element exception

        ll3.offer("ahmet");
        System.out.println(ll3);// ahmeti sona ekler
        ll3.poll();//ilk elemani siler
        System.out.println(ll3);

      //  System.out.println("ll4.remove() = " + ll4.remove());//bos listede NoSuchElementException verir
        System.out.println("ll4.poll() = " + ll4.poll());//null verir


    }
}
