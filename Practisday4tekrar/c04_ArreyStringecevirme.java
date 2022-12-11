package Practisday4tekrar;

import java.util.Arrays;

public class c04_ArreyStringecevirme {
    public static void main(String[] args) {


        // Array nasil String'e cevrilir

        int arr2[]= {12,15,25,14,3,12,65};

        String alistr = Arrays.toString(arr2);
        System.out.println(alistr);
        System.out.println(alistr.substring(5)); // bastaki [ dahil tum array'i String'e cevirir



    }
}
