package Ev_odevleri;

import java.util.Locale;
import java.util.Scanner;

public class haftasonu {


    public static void main(String[] args) {
        // Kullanicidan gun ismini isteyin
        // girilen gunun hafta ici veya hafta sonu oldugunu yazdirin

        // pazar --> haftasonu,  sali --> hafta ici


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gunadi giriniz");
        String gunadi=scan.next().toLowerCase();

        if (gunadi.equals("cumatesi") || gunadi.equals("pazar")) {
            System.out.println("girillen gun hafta sonu=");

        }if (gunadi.equals("pazartesi")|| gunadi.equals("sali")|| gunadi.equals("carsamba")
                ||gunadi.equals("persembe")||gunadi.equals("cuma")){

        System.out.println("HAFTAICI");

        }
}
}
