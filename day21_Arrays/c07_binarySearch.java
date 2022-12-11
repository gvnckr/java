package day21_Arrays;

import java.util.Arrays;

public class c07_binarySearch {
    public static void main(String[] args) {

        //binaryserch java da eleman aramanin kisa yoludur
        // Ancak dogru calismasi icin Arrayin sirali hale gelmesi gerekir.
        //sıralam yapilmazsa sonucu bulamaybilir yada yanlis bulur

        String[]harfler={"y","b","d","g","o"};
        String arananHarf="d";

        System.out.println( Arrays.binarySearch(harfler,arananHarf));
        //Binarysearc bize aradiğimiz elemanin indexini dondurur.

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
    }
}
