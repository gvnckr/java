package arrays;

import java.util.Arrays;

public class soru20_KarisikKelimeSiralam {
    public static void main(String[] args) {

        /*Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
                not: Test datadaki değerleri kullanınız.
   Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]

        Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]

        */

  int []sayilar= {1232, 1134,2345,1022};

  String[]kelimeler=  {"C Programming","C#", "C++", "Java", "PHP", "Python"};
       Arrays.sort(sayilar);
       Arrays.sort(kelimeler);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.toString(kelimeler));

    }


}
