package Ev_odevleri;

import java.util.Scanner;

public class cember {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        float y;


        System.out.println("lutfen yari capi giriniz)");


        y=scan.nextFloat();

        System.out.println("cemberin cevresi="+(y*3.14));
        System.out.println("cemberin alani="+ ((y*y)*3.14));
    }
}
