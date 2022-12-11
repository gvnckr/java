package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class soru39_PozitifNegativsayiAdetleri {
    public static void main(String[] args) {
      /*  Bir dizi içerisindeki pozitif tam sayı sayısını ve
        negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.
​
        Örnek:
        countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
        // Toplam 10 pozitif sayı var.
        // Tüm negatif sayıların toplamı -65'tir.
​
        Notlar :
        Boş bir dizi verilirse, boş bir dizi döndürür: []
        0 pozitif değil.

        */

        int sayi[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 };
         int poztif=0;
         int negatif=0;
         int pozitifsayi=0;
        for (int i = 0; i < sayi.length ; i++) {
            if(sayi[i]>0){
            pozitifsayi ++;

            }

       if (sayi[i]<0){
           negatif+=sayi[i];

       }

        }
        System.out.println("Toplam:"+ pozitifsayi+"adet pozitif sayi var");
        System.out.println("tum negatif sayilarin toplami="+negatif+" tir");

    }
}
