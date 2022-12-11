package Practisday4tekrar;

import java.util.Arrays;

public class c03_Arreykarilastirma {
    public static void main(String[] args) {

        // iki array'in esit oldugunu kontrol etme
        int arr1[]= {10,25,5,20};
        int arr2[]= {25,10,20,5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));




    }
}
