package day44_collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedListListDataTuru {
    public static void main(String[] args) {

        LinkedList <String>ll1=  new LinkedList();

        List<String>ll2=new LinkedList<>();

        Queue<String>ll3=new LinkedList<>();

        Deque<String>ll4=new LinkedList<>();//KUYRUK

         ll2.add("berk");
         ll2.add("enes");
         ll2.add("ayse");
         ll2.add("ali");
        System.out.println(ll2);//[berk, enes, ayse]
        System.out.println("ll2.remove(3) = " + ll2.remove(3));//ayse siler
        System.out.println(ll2.remove("kemal"));
        System.out.println("ll2.isEmpty() = " + ll2.isEmpty());//bosmu
        ll2.set(1,"ali");
        System.out.println(ll2);//enes gitti ali geldi
        ll2.retainAll(ll1);
        ll1.add("berk");
        ll1.add("ismail");
       ll2.retainAll(ll1);//ll2 ile ll1 ile karsilastirir ortak olanlari yazar
        System.out.println(ll1);

        System.out.println(ll2.hashCode());//referans yazar
      ll2.add("fatif");
        System.out.println(ll2.hashCode());

    }
}
