package Practisday5;

import java.util.Scanner;


public class C03_İfElse {
    public static void main(String[] args) {

        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf=scan.next().toLowerCase();
        String sesliharfler="aeiou";
        String sessizharler="bcdfghjklmnpqrstxvwyz";

        if (harf.length()==1){
            for (int i = 0; i <sesliharfler.length() ; i++) {
                if(sesliharfler.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                }else if (sessizharler.contains(harf)){
                    System.out.println("sessiz harf");
                    break;
                }else {
                    System.out.println("yanlis karekter girdiniz");
                    break;
                }

            }
        }else {
            System.out.println("birden fazla karekter giridnizS");
        }








    }
}
