package Ev_odevleri;

import java.util.Scanner;

public class karalan {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfen karenin bir kenar uzunlugunu giriniz");
         int a;

         a=scan.nextInt();

        System.out.println("karenin alani=" +(a*a));
        System.out.println("karenin cevresi="+(a*4));




    }
}
