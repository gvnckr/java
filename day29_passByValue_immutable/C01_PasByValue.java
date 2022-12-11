package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PasByValue {
    public static void main(String[] args) {

        /*
        4 elemanli bir aarey olusturalim ayri bir methodda 2. ve 4. elemenlarini 100 den kucuk rasgele bir sayi ile degistirelim
        ve yeni halini yazdiralim
         */


     int []arr={5,7,8,10};

     elemanDegistir(arr);
        System.out.println("main methodun icindiger method aclistiktan sonra ="+Arrays.toString(arr));
//[5,7,8,10] beklenen
    }

  public static void elemanDegistir(int[] arr) {

      Random rnd=new Random();

      arr[1]=rnd.nextInt(100);
      arr[3]=rnd.nextInt(100);

      System.out.println(Arrays.toString(arr));



    }
}
