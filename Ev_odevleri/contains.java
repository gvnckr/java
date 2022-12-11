package Ev_odevleri;

import java.util.Scanner;

public class contains {
    public static void main(String[] args) {


        /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfrn mail adresi giriniz");
        String email=scan.next();

        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmai.com")==(email.length()-10)) {
            System.out.println("mail adesi kaydedildi");
        }else{
            System.out.println("yazimi kontrol edin");






        }
}
}
