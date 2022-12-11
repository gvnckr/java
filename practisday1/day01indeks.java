package practisday1;

import java.util.Scanner;

public class day01indeks {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("kilonuzu yaziniz");
        double kilo=scan.nextDouble();

        System.out.println("boynuzu giriniz (cm)");
        double boy=scan.nextDouble();
        boy=boy/100;//metre olarak almak icin bolduk
        double vke=kilo/(boy*boy);
        System.out.println("vke="+"  "+vke);





    }
}
