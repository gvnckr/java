package day17_nestedForLoopOdev;

import java.util.Scanner;

public class c06_bolen {
    public static void main(String[] args) {
        // kullanicidan sayi alin ve tam bolenlerini yazdirin


        Scanner scan =new Scanner(System.in);
        System.out.println("baslangic degeri giriniz");
        int sayi=scan.nextInt();
        int bolen=1;
        int sayac=0;

        while (bolen<sayi){

        if(sayi%bolen==0){
            sayac++;
            System.out.println(bolen);


        }
            bolen++;
        }

        System.out.println( sayi +" sayisin bolenler" + " adet =" + sayac);
    }
}
