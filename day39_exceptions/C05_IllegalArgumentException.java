package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {

/*
Soru: Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici
sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
 */
        Scanner scan = new Scanner(System.in);

        System.out.println("yasini giriniz");

        int yas = scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("yasiniz"+yas);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("yasiniz 0 dan kucuk olamaz");
        }

    }
}
