package replitsorulari;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını bulan bir Java programı yazınız.(Switch Case Kullanınız) (Mülakat Sorusu / Kaçak Yıl)
        not:1,3,5,7,8,10,12 aylarinin gun saysi 31
        4,6,9,11 gun sayisi 30
        subat da 4 yilda bir 29

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ogrenmek istediginiz ayi giriniz ");
        int ay = scan.nextInt();

        int gunsayisi=0;
        switch (ay){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunsayisi=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunsayisi=30;
                break;
            case 2:
                gunsayisi=28;

            default:
                System.out.println("gecersiz ay girdiniz");
             break;

        }
        System.out.println(ay+". ayin" +  " gun sayisi: "+gunsayisi);


    }
}
