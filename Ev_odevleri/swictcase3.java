package Ev_odevleri;

import java.util.Scanner;

public class swictcase3 {
    public static void main(String[] args) {

        //kullanicidan sdet kısalatmalarindan birini alin ve karsiliklarini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");

         char harf= scan.next().toLowerCase().charAt(0);

         switch (harf){
             case 's':
                       System.out.println("sofware");
                       break;
             case 'd':
                 System.out.println("devoloper");
                 break;

             case 'e':
                 System.out.println("enginer");
                 break;
             case 't':
                 System.out.println("tester");
                 break;




         }

    }
}
