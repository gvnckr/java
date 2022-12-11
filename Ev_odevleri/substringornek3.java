package Ev_odevleri;

import java.util.Scanner;

public class substringornek3 {

    public static void main(String[] args) {


        /*
		 Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
		 ve asagidaki gibi yazdirin
		 isim-soyisim : M***** B*******
		 kart no : **** **** **** 1234
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.next();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.next();
        System.out.println("Lutfen kart numaranizi giriniz");
        String kartNo=scan.next();



        char isimilkharf=isim.toUpperCase().charAt(0);
       String isimgerikalan=isim.substring(1).replaceAll("\\w","*");
       String soyisimilkharf=soyisim.toUpperCase().substring(0,1);
       String soyisimgeriyekalan=soyisim.substring(1).replaceAll("\\w","*");

        String kartnobasi="**** **** **** ";
        String kartnosonu=kartNo.substring(kartNo.length()-4);

        System.out.println("isminiz soyisminiz="+isimilkharf+soyisimgeriyekalan+soyisimilkharf+soyisimgeriyekalan);
        System.out.println("kartno="+kartnobasi+kartnosonu);






    }
}
