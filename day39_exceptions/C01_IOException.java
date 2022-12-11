package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

/*
java da pc deki bir dosyaya erismek istiyorsak fileinputstrim Clasindan yardim aliriz
ayni sekilde javadan pc deki bir dosyaya ekleme veya update yapmak istersek FileOutputStream classindan
yardim aliriz
 */
        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");
/*
Goruldugu gibi compile time da altini kirmizi cizen her durum compile time Error degildir
java da bazi exceptionlar da cte dir ozellikle dosya okuma veya yazma ile ilgili exceptionlar ctexceptiondur
compile time exc. de java cozum icin iki yol onerir
1- try catc ile cevrelemek
2- methot signature ina throws keyword ile beklenen exception turunu yazmak
 throws exceptions sadece olayin farkinda oldugumuzun deklaresidir.
 Exceptionun handle edilmesinde hic rolu yoktur yani try catch ile kontrol altina aldigimiz exceptionlarda kod acalismaya
 devam ediyordu ancak throws exception yazdigimizda java bir exceptionla karsilasirsa java hic birsey yapmamisiz gibi
 hata mesaji yayinlayip calismayi durdurur.
 */
        FileInputStream fis2=new FileInputStream("src/day39_exceptions/Test.txt");
 int k;

        FileInputStream fis3= null;
        try {
            fis3 = new FileInputStream("src/day39_exceptions/Test.txt");

            while ((k=fis.read()) !=-1){

                System.out.print((char) k);
            }
        } catch (IOException e) {
            System.out.println("hata veriyor");
        }

        System.out.println(fis3);




    }
}
