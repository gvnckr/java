package ev_calismalari;

import java.util.Scanner;

public class for_loop5tersCevirme {
    public static void main(String[] args) {
        // Soru 8 ) Interview Question Kullanicidan bir String isteyin ve
        // Stringi tersine ceviren bir program yazin.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen tersine cevirmek icin bir yazi giriniz");
        String yazi=scan.nextLine();

        System.out.print("Girdiginiz yazinin tersi : ");
        for (int i = yazi.length()-1 ; i >= 0; i--) {

            System.out.print(yazi.charAt(i));
        }

    }
}
