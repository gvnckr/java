package Ev_odevleri;

import java.util.Scanner;

public class indexof2 {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfen bir cumle giriniz");
        String cumle= scan.nextLine();


        Scanner scan2=new Scanner(System.in);
        System.out.println( "lutfen bir kelime giriniz");
        String kelime= scan.nextLine();

        if (cumle.indexOf("kelime")>0){
            System.out.println("kelime cumlede kulllanılmis");

        }else {
            System.out.println("1 defa kullanılmis");
        }








    }
}
