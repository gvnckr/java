package practisday2;

import java.util.Scanner;

public class day02switchcase2 {
    public static void main(String[] args) {

 /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */


        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen A,B ya da C giriniz");
        char harf= scanner.next().toUpperCase().charAt(0);

        switch (harf){
            case 'A':
                System.out.println("JAVA IS EASY");
                    break;
            case 'B':
                System.out.println("JAVA IS FUN");
                break;
            case 'C':
                System.out.println("I NEED TO STUDY");
                break;
            default:
                System.out.println("GECERLI BIR HARF GIRINIZ");
        }









    }
}
