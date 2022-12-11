package ev_calismalari;

import java.util.Scanner;

public class for_Loop2 {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // 1'den kullanicinin girdigi sayiya kadar olan tum tamsayilarin
        // toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();

         int toplam=0;

        for (int i = 1; i < sayi; i++) {

            toplam+=i;

        }


        System.out.println(toplam);

    }
}
