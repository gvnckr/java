package evodevleri_forLoop;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

        //kullanicidan bir sayi alın 1 den baslayarak girilen sayiya kadar yazdirin ancak;
        // sayi 3 un kati ise "java"  yazdirin
        //5 kati ise "guzeldir yazdirin
        //hem 3 un hem 5 in kati ise java guzeldir yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("java guzeldir" +" ");

            } else if (i%5==0) {
                System.out.print("guzeldir"+ " ");
            } else if (i%3==0) {
                System.out.print("java"+ " ");
            }else
                System.out.print(i+ " -");



        }
    }
}
