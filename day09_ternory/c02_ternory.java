package day09_ternory;

import java.util.Scanner;

public class c02_ternory {

    public static void main(String[] args) {

       //kullanıcıdan bir sayi alın sayi pozitifse pozitif negativse negative yazdır
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen sayi giriniz");
        double sayi=scan.nextDouble();

       // System.out.println(sayi>0 ?"sayi pozitif" : (sayi*sayi));


        System.out.println(sayi>0 ?"sayi pızitif":"sayi negativ");

        System.out.println(sayi>0?"sayi pozitif":"sayi nnegatif");


    }
}
