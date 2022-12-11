package Ev_odevleri;

import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {


        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("4 harfli bir kelime giriniz");
        String str = scan.nextLine();

        if (str.length()!=4) {
            System.out.println("lutfen 4 harfli bir isim giriniz");

        }else{
            System.out.println(str.substring(3));
            System.out.println(str.substring(2,3));
            System.out.println(str.substring(1,2));
            System.out.println(str.substring(0,1));




        }




    }




}
