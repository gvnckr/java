package practisday1;

import java.util.Scanner;

public class day01notHesaplama {
    public static void main(String[] args) {


        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        int vize1;
        int vize2;
        int finalnot;
        System.out.println("vize 1:");
        vize1= scan.nextInt();
        System.out.println("vize2");
        vize2= scan.nextInt();
        System.out.println("finalnot");
        finalnot= scan.nextInt();
        double sonuc=((vize1+vize2)/2)*0.3+finalnot*0.7;
        System.out.println("sonuc="+""+sonuc);




    }
}
