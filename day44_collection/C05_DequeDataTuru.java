package day44_collection;

import java.util.Deque;
import java.util.LinkedList;

public class C05_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll3=new LinkedList<>();//KUYRUK
        ll3.add("polat");
        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("kadir");


        ll3.removeLastOccurrence("polat");
        System.out.println(ll3);

        System.out.println("ll3.pop() = " + ll3.pop()); //bastaki elementi siler bize dondürür


    }
}
