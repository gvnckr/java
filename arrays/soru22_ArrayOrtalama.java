package arrays;

public class soru22_ArrayOrtalama {
   /* Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array =  [20, 30, 25, 35, -16, 60, -100 ]


    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
 */
   public static void main(String[] args) {


int []sayilar={ 20, 30, 25, 35, -16, 60, -100};
int  toplam=0;


      for (int i = 0; i <sayilar.length ; i++) {
         toplam+=sayilar[i];

      }
      System.out.println(toplam/ sayilar.length);
   }


   }


