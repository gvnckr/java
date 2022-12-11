package arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class soru38_buyukKucukfarki {

   /*   38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.
            ​
    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
            ​
*/
   public static void main(String[] args) {
int []sayi={10, 15, 20, 2, 10, 6 };
      Arrays.sort(sayi);

      for (int i = 0; i < sayi.length ; i++) {

      }

      System.out.println("fark = " +(sayi[sayi.length-1]-sayi[0]));

   }
}


