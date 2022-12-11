package day19_scope;

import day14_methodcreation.C02_Methodcreation;
import day14_methodcreation.C03_Methodcreation;
import day14_methodcreation.C05_MethodCreationReturn;

public class C04_Tekrar {


   int sayi=10;


    String isim="guven";






    public static void main(String[] args) {


       C04_Tekrar obje1=new C04_Tekrar();
        System.out.println(obje1.sayi);
        C04_Tekrar obje2=new C04_Tekrar();


        System.out.println(obje2.isim);

         C02_StaticVariables.staticMethod();

         C02_StaticVariables obje=new C02_StaticVariables();

    }





}
