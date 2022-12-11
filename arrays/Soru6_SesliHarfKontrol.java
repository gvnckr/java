package arrays;

import java.util.Scanner;

public class Soru6_SesliHarfKontrol {
    public static void main(String[] args) {
 /*       6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
                değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
  Sesli harfler: a,e,i,o,u
  Test Data:
        a
   Beklenen Çıktı:
   a harfi sesli harfdir
       Test Data:
        d
          Beklenen Çıktı:
        d harfi sesiz harftir

        Test Data:
        we  yada %
​
        Beklenen Çıktı:
       Yanlis karakter girdiniz!


*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String harf=scan.next().toLowerCase();

        String sesliharf= "a,e,i,o,u";
        char karekter=harf.charAt(0);

       if (harf.length()==1||karekter>='a'||karekter<='z'){
           if (sesliharf.contains(harf)){
               System.out.println("sesli harf");
           }else {
               System.out.println("sessiz harf");
           }
       } else {
           System.out.println("yanlis karekter");

       }



    }
}