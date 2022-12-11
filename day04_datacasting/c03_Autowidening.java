package day04_datacasting;

public class c03_Autowidening {

    public static void main(String[] args) {


       //java farklı değerleri kapsamı büyük olanı kabul eder//

        // dar veri turundeki bir degeri, genis veri turundeki variable'a
        // otomatik olarak assign eder

        byte sayi1= 23;
        short sayi2=55;

        int sayi3= sayi1+sayi2; // 78


        double sayi4= sayi1*sayi2; // 1265.0


        sayi4= (double)sayi2/sayi1 ;  // 53.0 / 23 = 2.391

        System.out.println(sayi4);

        int sayi6,sayi7;

        sayi6=10;


        System.out.println(sayi6/sayi4);












    }
}
