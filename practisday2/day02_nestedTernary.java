package practisday2;

import java.util.Scanner;

public class day02_nestedTernary {
    public static void main(String[] args) {
        /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen 0-9 arasi bir sayi giriniz");
        int sayi=scanner.nextInt();

        System.out.println(sayi>=0  && sayi<=9 ?  "sayi gecerli": "gecersiz");

        if (sayi<=9&&sayi>=0){
            System.out.println("gecerli sayi");
        }else {
            System.out.println("gecersiz sayi" );
        }













    }
}
