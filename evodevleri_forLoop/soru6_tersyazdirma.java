package evodevleri_forLoop;

import java.util.Scanner;

public class soru6_tersyazdirma {
    public static void main(String[] args) {
        // kullanicidan bir string isteyin ve tersten yazirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");

        String cumle=scan.nextLine();



        int i;

        for ( i = cumle.length()-1; i > -1; i--) {
            System.out.print(cumle.charAt(i));

        }





    }
}
