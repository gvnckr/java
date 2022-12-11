package day21_Arrays;

import java.util.Arrays;

public class c05_ArrayeElementEkleme {
    public static void main(String[] args) {

        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun


        String[]SinifLİst={"alican","nida yucedal","musa yaman"};

        String eklenecekİsim="Murat Babayigit";

        SinifLİst=elemanEkle(SinifLİst,eklenecekİsim);

        System.out.println(Arrays.toString(SinifLİst));
    }

    private static String[] elemanEkle(String[] sinifLİst, String eklenecekİsim) {
        String[]yeniSinifListesi=new String[sinifLİst.length+1];//[null,null]
    // eski listeden bir eleman fazla uzunlukta bir aarey olustu

        //
        for (int i = 0; i <sinifLİst.length ; i++) {
            yeniSinifListesi[i]=sinifLİst[i];

        }
        //eski listenin hepsi yeni listeye tasidik
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekİsim;
   //
        return yeniSinifListesi;
    }
}
