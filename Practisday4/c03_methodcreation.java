package Practisday4;

import java.util.Scanner;

public class c03_methodcreation {
/*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */
public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

    System.out.println("metre ve km donusturmek istediginiz cm degeri giriniz");

    double santiMeterValue=scan.nextDouble();

    convertSM(santiMeterValue);




}

    private static void convertSM(double santiMeterValue) {


    double meter=santiMeterValue/100;

    double kMeter=santiMeterValue/100000;
        System.out.println("girilen santimeter degeri :"+ santiMeterValue +meter+ "meteredir, "+ kMeter + "kmdir");
    }


}
