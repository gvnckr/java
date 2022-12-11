package arrays;

import java.util.Scanner;

public class soru32_EsitlikKontrol {

    public static void main(String[] args) {
/*
        32----
        İki integer sayının eşitliğini kontrol eden java methodunu yazınız.
​
        num1 = num2 => true

*/
        int num1=0;
        int num2=0;




        System.out.println(esitMi(num1,num2));

    }

    public static boolean esitMi(int num1, int num2) {

        boolean kontrol=false;

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen kontrol icin 2 sayi giiniz");
         num1=scan.nextInt();
         num2=scan.nextInt();
         if (num1==num2){
         kontrol=true;

         }else {
             kontrol=false;
         }


        return kontrol;
    }
}
