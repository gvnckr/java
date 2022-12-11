package practisday1;

import java.util.Scanner;

public class deneme5 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("uc basamkli sayi giriniz");
        //sayinin birler basamgi kactır
        int sayi=scan.nextInt();
           //153
        int birlerbas=sayi%10;
        System.out.println("birlerbas =" +birlerbas);//3
        sayi/=10; //sayi15 oldu onlar basamagini bulmak icin


        int onlarbas=sayi%10;
        System.out.println("onlarbas=" +onlarbas);

        sayi/=10;

        int yuzlerbas=sayi%10;
        System.out.println("yuzlerbas= " +yuzlerbas);

        System.out.println(birlerbas+onlarbas+yuzlerbas);





    }
}
