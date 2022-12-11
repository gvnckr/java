package ev_calismalari;

import java.util.Scanner;

public class for_loop1 {
    public static void main(String[] args) {

        // kullanicidan 2 tamsayi alin
        // ilk sayidan, ikinci sayiya kadar tum tamsayilari
        // yanyana aralarinda bosluk olarak yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz");

        int sayi1= scan.nextInt();
        System.out.print("lutfen 2. sayiyi giriniz ");

        int sayi2= scan.nextInt();


        if (sayi1>sayi2){
            for (int i = sayi1; i < sayi2; i--) {
                System.out.print(i +" ,");
            }
        }else{
          //  (sayi1<sayi2);

            for (int i = sayi1; i <= sayi2; i++) {
                System.out.print(i +", ");
            }
        }





    }
}
