package evodevleri_forLoop;

import java.util.Scanner;

public class soru10_faktoriyel {
    public static void main(String[] args) {

        //Kullanicidan 10 kadar pozitif bir deger alin ve faktoriyelini hesaplayin


        Scanner scan=new Scanner(System.in);

        System.out.println("10 a kadar bir tam sayi giriniz");

        int sayi=scan.nextInt();

         int faktoriyel=1;
        if (sayi<0 || sayi>20){
            System.out.println("gecerli bir sayi giriniz");
        } else if (sayi==0) {
            System.out.println("sifirin faktoriyeli 1 dir");

        }else {
            for (int i = 1; i <= sayi; i++) {
             faktoriyel*=i;

            }
            System.out.println("Girilen sayinin faktoriyeli = " + faktoriyel);
        }



    }
}
