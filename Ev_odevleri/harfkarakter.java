package Ev_odevleri;

import java.util.Scanner;

public class harfkarakter {


    public static void main(String[] args) {

        //kullanicidan bir karekter girmesini isteyin
        // karakter olup olmadiğini yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfen bir karekter giriniz");
        char karekter=scan.next().toUpperCase().charAt(0);


        if ( (karekter >='a' && karekter <= 'z') || (karekter>='A' && karekter<='Z')){
            System.out.println("girilen bir karekter");
        }else {
            System.out.println("karekterdğil");
        }

        }
   //Scanner scan= new Scanner(System.in);
        //        System.out.println("Lutfen bir karakter giriniz");
        //        char harf=scan.next().charAt(0);
        //        if ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
        //            System.out.println("Girilen karakter bir harf");
        //        } else {
        //            System.out.println("Girilen karakter bir harf degil");
        //        }




}
