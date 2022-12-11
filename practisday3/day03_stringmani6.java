package practisday3;

import day14_methodcreation.C05_MethodCreationReturn;

import java.util.Scanner;

public class day03_stringmani6 {


    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("string girin");
        String str= scan.nextLine().toLowerCase();

        System.out.println(xyzvarmi(str));


    }

    private static boolean xyzvarmi(String str) {
        if (str.contains("xyz")){
            return true;
        }else
        return false;
    }
}
