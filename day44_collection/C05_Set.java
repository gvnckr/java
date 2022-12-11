package day44_collection;

import java.util.Deque;
import java.util.LinkedList;

public class C05_Set {

    //kume mantigi ile calisir her eleman tektir

    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");
        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop());
    }
}
