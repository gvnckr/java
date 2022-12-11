package evodevleri_forLoop;

import java.util.Scanner;

public class soru8_tersyazdirmamedodu {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str=scan.nextLine();


        tersoku(str);






    }

    private static void tersoku(String str) {

        for (int i = str.length()-1; i > -1; i--) {
            System.out.print(str.charAt(i));

        }

    }
}
