package day08_ifElse;

import java.util.Scanner;

public class C02_İFeLSESTATEMAİNT {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("LUTFEN 0 dan 100 kadar NOT GIRINIZ");

        double not= scan.nextDouble();

        if(! (not>0 && not<=100)){
            System.out.println("gecerli bir not giriniz");
        } else if (not<50) {
            System.out.println("notunuz:D");
        } else if (not<60) {

            System.out.println("notunuz: C");
        } else if (not<80) {
            System.out.println("notunuz :B");
        }else {

            System.out.println("notunuz:A");
    }
    }


}
