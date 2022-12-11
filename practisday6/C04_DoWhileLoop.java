package practisday6;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

      //  Google Ceviri : Kullanıcıdan bir kelime girmesini isteyin. Kelimenin tek sayıda karakteri varsa
      //  ve 3 veya daha fazla karaktere sahip,
      //          karakteri kelimenin ortasına yazdırın.
       //         kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."


            Scanner scan = new Scanner(System.in);
            System.out.println("Kelime giriniz:");
            String kelime = scan.nextLine();
            String karakter = " ";
            int uzunluk = kelime.length();
            String bolunenKelime = "";
            // forla cozumu:
            if(uzunluk<3){
                System.out.println("Girilen kelime 3 karakterden az");
            }
            if (uzunluk % 2 == 1 && uzunluk >= 3) {
                System.out.println("Karakter giriniz: ");
                karakter = scan.next();
                for (int i = 0; i < uzunluk; i++) {
                    bolunenKelime = kelime.substring(0, kelime.length() / 2) +
                            karakter + kelime.substring(kelime.length() / 2);
                }
                System.out.println(bolunenKelime);
            } else System.out.println("Kelime cift sayida karakter iceriyor Yanlis kelime girdiniz");





}
}
