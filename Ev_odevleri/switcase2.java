package Ev_odevleri;

import java.util.Scanner;

public class switcase2 {

    public static void main(String[] args) {

        //kullanicidan sayi alin ve basamaklarını yazdirin
        System.out.println("lutfen bir sayi giriniz");
        Scanner scan =new Scanner(System.in);
        int sayi= scan.nextInt();



        if (sayi==10){
            System.out.println("iki basamakli en kucuk sayi");
        } else if (sayi==100) {
            System.out.println("uc basamakli en kucuk sayi");
        } else if (sayi==1000) {
            System.out.println("dort basamakli en kucuk sayi");
        }else {
            System.out.println("gecerli bir sayi giriniz");
        }















    }
}
