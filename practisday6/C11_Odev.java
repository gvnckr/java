package practisday6;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin="mehmet.1234";

        int girisHakki=3;

        Scanner scan = new Scanner(System.in);
        System.out.println("****HOSGELDİNİZ****");

        while (true){
            System.out.println("pin kodunuzu giriniz");
            String girilenpin=scan.nextLine();
            if (pin.equalsIgnoreCase(girilenpin)){
                System.out.println("basarili pin");
                break;
            }else {
                System.out.println("yanlis giris yaptiiz ....");
                girisHakki--;
                System.out.println("kalan giris hakkiniz ="+girisHakki);
            }
       if (girisHakki==0){
           System.out.println("giris hakkiniz kalmadi... Bloke oldu ");

       }else {
           System.out.println("puk kodu giriniz");
       }
        }
    }
}
