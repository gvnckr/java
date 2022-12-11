package Ev_odevleri;

import java.util.Scanner;

public class indexof {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        System.out.println("lutfen bir harf giriniz");
        String harf= scan.next();

        if (cumle.indexOf("harf")==-1){
            System.out.println("cumlede "+harf + "bulunmamaktadir");
        }else {
            System.out.println("cumlede"+harf + "bulunmaktadir");
        }





    }
}
