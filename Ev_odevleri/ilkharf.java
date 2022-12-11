package Ev_odevleri;

import java.util.Scanner;

public class ilkharf {

    public static void main(String[] args) {


        // Kullanicidan ismini isteyip ilk harfini buyuk harf olarak yazdirin
        // mehmet ==> basharfiniz : M


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen adnizi giriniz");
        char ilkharf= scan.next().toUpperCase().charAt(0);

        System.out.println("ilk harf ="+ilkharf);








    }
}
