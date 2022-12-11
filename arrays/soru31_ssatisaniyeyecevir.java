package arrays;

import java.util.Scanner;

public class soru31_ssatisaniyeyecevir {
    public static void main(String[] args) {

/*31----
    Saati saniyeye çeviren java methodunu yazınız.
​
    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
 */
        int saat=1;
        satiSaniyeyCevir(saat);
    }

 public static void satiSaniyeyCevir(int saat) {

        Scanner scan=new Scanner(System.in);
        System.out.println("saniyeye cevirmek icin saat giriniz");

        saat=scan.nextInt();
     System.out.println("girilen saatin dakika miktari:"+ saat*60 + "\n girilen saatin sayiye miktari:" + saat*(60*60));
    }
}
