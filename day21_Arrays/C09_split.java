package day21_Arrays;

import java.util.Arrays;

public class C09_split {
    public static void main(String[] args) {
        //split bir aarey methodu degil string methodudur
        //ama arrey dondurdugu icin simdi anlatilıyor
        //split ile herahngi bir stringi istedigimiz sekilde paraclara bolup bir arrey haline getiriyoruz

        String str=" java ne kadar guzel";

       String[] kelimler=str.split(" ");
        System.out.println(Arrays.toString(kelimler));
        String[] kelimlerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimlerNe));

        String[] kelimlerE=str.split("e");
        System.out.println(Arrays.toString(kelimlerE));
        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));
    }
}
