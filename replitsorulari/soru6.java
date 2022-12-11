package replitsorulari;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
/*
        Kullanıcıdan bir ad yazmasını isteyin,
 adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
Dize aynı karakterlere sahipse
Yazdır “Dize çift karakterler içeriyor” Aksi takdirde
Yazdır “Dizenin benzersiz karakterleri var”
Lütfen üçlü kullanın.
Giriş
ala
Çıktı:
 Dize yinelenen karakterler içeriyor
*/





        Scanner scan =new Scanner(System.in);

        System.out.println("uc harfli isim giriniz");
        String isim=scan.next();
        String yinelenen=isim.substring(0,isim.length());


        if (isim.contains(yinelenen)){
            System.out.println("cift karekter");
        } else if((!isim.contains(yinelenen))){
            System.out.println("yinelenen yok");

        }else {
            System.out.println("gecerli karekter giriniz");
        }



    }
}
