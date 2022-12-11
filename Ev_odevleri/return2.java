package Ev_odevleri;

import java.util.Scanner;

public class return2 {

    public static void main(String[] args) {

        String sehir=sehiral();
        String tarih=tarihal();
        System.out.println("girilen sehir= " +sehir);
        System.out.println("girilen tarih= " + tarih);


    }

  public static String tarihal() {
         String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("tarih giriniz");

        int yil=scan.nextInt();


        return tarih;

    }

    public static String sehiral() {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sehir giriniz");
        String sehir=scan.next();

        return sehir;
    }
}
