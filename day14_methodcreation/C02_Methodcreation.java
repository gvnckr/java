package day14_methodcreation;

import day13_methodcraction.C04_MethodCreation;

public class C02_Methodcreation {
    public static void main(String[] args) {
        // Verilen 3 basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim


      int input=423;

      rakamlariTopla(input);
        C04_MethodCreation.topla(6,3);
        c01_methodcreation.terstenYazdir("NURİ");
        c01_methodcreation.terstenYazdir("vur");

    }

   public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;


       birlerBasamagi=input%10;
       rakamlarToplami+=birlerBasamagi;
       input/=10;

       birlerBasamagi=input%10;
       rakamlarToplami+=birlerBasamagi;
       input/=10;
       System.out.println("Girdiginiz " + temp +" sayinin rakamlari toplami =" +rakamlarToplami);


    }


}
