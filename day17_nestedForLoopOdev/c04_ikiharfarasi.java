package day17_nestedForLoopOdev;

import java.util.Scanner;

public class c04_ikiharfarasi {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("baslangic harfi giriniz");
        char basharf=scan.next().toUpperCase().charAt(0);
        System.out.println("2.harfi giriniz");
        char sonharf=scan.next().toUpperCase().charAt(0);

        while (basharf<sonharf){

            System.out.print(basharf + ",");

            basharf++;
        }


    }
}
