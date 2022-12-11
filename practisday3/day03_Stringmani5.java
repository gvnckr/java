package practisday3;

import java.util.Scanner;

public class day03_Stringmani5 {

    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("cumle olusturmak icin  birinci kelimeyi giriniz");
         String str1= scan.nextLine();
        System.out.println("2.kelime");
        String str2= scan.nextLine();
        System.out.println("3.kelime");
        String str3= scan.nextLine();
        System.out.println("4.kelime");
        String str4= scan.nextLine();

        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+
              " " + str2 + " " +str3 +" "+ str4 +"." );
    }
}
