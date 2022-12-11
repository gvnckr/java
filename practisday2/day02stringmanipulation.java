package practisday2;

import java.util.Scanner;

public class day02stringmanipulation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin



        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen adiniz  giriniz");
        String isim= scanner.nextLine().toUpperCase();
        System.out.println("soyadinizi giriniz");
        String soyisim= scanner.nextLine().toUpperCase();

        System.out.println(isim+" " +soyisim);










    }
}
