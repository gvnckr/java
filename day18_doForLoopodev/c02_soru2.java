package day18_doForLoopodev;

import java.util.Scanner;

public class c02_soru2 {
    public static void main(String[] args) {

             /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozitifsayi=0;
        int pozitifsayitop=0;
        int negatifsayilaradet=0;



        do {
            System.out.println("lutfen pozitif sayi giriniz");
            sayi= scan.nextInt();
            if (sayi>0){
                pozitifsayi+=sayi;
                pozitifsayitop++;


            } else if (sayi<0) {
                System.out.println("lutfen pozitif sayi giriniz");
               negatifsayilaradet++;

            }


        }while (sayi!=0);
        System.out.println( pozitifsayi + "= pozitif sayilar toplamidir  = "+pozitifsayitop+ "tane pozitif sayi giridniz");
        System.out.println(negatifsayilaradet +" = negeatif sayi girdiniz");





    }
}
