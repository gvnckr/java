package practisday3;

import java.util.Scanner;

public class day03_Stringmanpilation {
    public static void main(String[] args) {

//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan= new Scanner(System.in);

        System.out.println("string1:");
        String str1=scan.nextLine();

        System.out.println("string2:");
        String str2= scan.nextLine();

        System.out.println("1.yontem:"+ str1+" " +str2);

        System.out.println("2.yontem :"+str1.concat(" " +str2));


        String str1_indextensonrasi= str1.substring(1);
        String str2_0indexsonrasi=str2.substring(1);
        System.out.println("manipilation sonrasi =" + str1_indextensonrasi + " " +str2_0indexsonrasi);

    }
}
