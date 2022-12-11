package day48_mapsTheEnd;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {
    public static void main(String[] args) {

        Map<String,Integer>harfMapi=new HashMap<>();
        harfMapi.put("A",3);
        harfMapi.put("B",5);
        harfMapi.put("C",1);
        harfMapi.put("D",2);
        harfMapi.put("E",4);
        System.out.println(harfMapi);
    harfMapi.compute("A",(k,v)->v*2);
        System.out.println(harfMapi);


    }
}
