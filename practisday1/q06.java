package practisday1;

import java.util.Scanner;

public class q06 {

    public static void main(String[] args) {

/*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */

        int galon=1000;
        double litre=galon*3.785;

        String sonuc1=galon+ "galon degeri  "+litre +" litreye esittir";
        System.out.println("sonuc1 = " + sonuc1);


        int l=100;

        double g=l/3.785;
        System.out.println(l+"litre degeri=" +g+ "litre esittir");

        Scanner scan=new Scanner(System.in);

        System.out.println("fahrenayt degeri giriniz");
        double fh= scan.nextDouble();

        System.out.println("girdiginiz fahrenayt degeri : "  +  (fh-32)*5/9 );


        Scanner SCAN= new Scanner(System.in);

        System.out.println("lutfen 1 sayi giriniz");

        int sayi= scan.nextInt();

        System.out.println("lütfen 2. sayiyi giriniz");
        int sayi2=scan.nextInt();

        System.out.println(" girilen sayilear toplami= "  + (sayi+sayi2));


    }
}
