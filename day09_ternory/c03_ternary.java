package day09_ternory;

import java.util.Scanner;

public class c03_ternary {
    public static void main(String[] args) {

        //kullaıcıdan bir sayi isteyin sayi pozitifise sayiyi yazdırın
        //sayi sifir veya negativse bir sayi daha isteyin ikisinin carpimini yazdirin



        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen sayi giriniz");
        double sayi=scan.nextDouble();


        if (sayi>0){
            System.out.println(sayi);
        }else{
            System.out.println("lutfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);
        }


          //eger ifelse icinde yeni kodlar varsa ternory ile yapmamiz mumkun olmaz






    }
}
