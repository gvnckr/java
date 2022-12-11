package Practisday4tekrar;

import java.util.Scanner;

public class c01tekrar {
    public static void main(String[] args) {

        //kelimeyi testen yazdir


        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 4 harfli bir kelime  yaziniz : ");

        String kelime=scan.nextLine();
        System.out.println(kelime.length());

        if (kelime.length()<=4){
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);
            System.out.println("tersten ="+ dort +uc +iki+ bir);
        }else {
            System.out.println("girilen kelime 4 harten buyuk");
        }










    }

}
