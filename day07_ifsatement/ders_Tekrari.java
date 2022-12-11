package day07_ifsatement;

import java.util.Scanner;

public class ders_Tekrari {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir gun ismi giriniz");

        String girilengun= scan.next().toLowerCase();

        if (girilengun.equals("pazar") || girilengun.equals("cumartesi")){

            System.out.println("girilen gun HAFTASONU");
        }


        if(girilengun.equals("pazartesi") || girilengun.equals("sali") || girilengun.equals("carsamba") ||
                    girilengun.equals("persembe") || girilengun.equals("cuma")){

                System.out.println("girilen gün HAFTAiCi");
        }

            if (!(girilengun.equals("pazartesi") || girilengun.equals("sali") || girilengun.equals("carsamba") ||
                    girilengun.equals("persembe") || girilengun.equals("cuma") || girilengun.equals("cumartesi") ||
                    girilengun.equals("pazar"))){
                System.out.println("lutfen gecerli bir deger giriniz");
            }



    }










}



