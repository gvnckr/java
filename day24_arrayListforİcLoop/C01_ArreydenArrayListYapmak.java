package day24_arrayListforİcLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArreydenArrayListYapmak {
    public static void main(String[] args) {

        String[]arr={"ismail","nurullah","fatih"};

        //uzun listeler olusturmak gerektiginde tek tek eklemek yerine Arrey olusturup bunlari
        // liste cevirmek daha pratik olabilir
        //lOOP ile arreyde deki tum elementleri liste atabiliriz
        // Arreys.asLİst() kullanabiliriz ancak bu methodun iki yan etkisi vardır
        //- arreys clasi kullandildigi icin arrey ozellikleri gecerli olur dolayisyle  listte olan remove gibi size
        // degistiren methotlar kullanilamaz
        //kaynak olan arrey ile urun olan list ozellestirilir birinde yapilan degisiklik otomatik digerini de etkiler

        List<String> siniflist= Arrays.asList(arr);
        System.out.println(siniflist);//ismail nurullah aftih
         //1 . YAN ETKİ
      //  siniflist.add("erdi"); hata verir
        //siniflist.remove(1); hata verir
        // 2. YAN ETKİ

        arr[1]="emre";
        System.out.println(Arrays.toString(arr));
        System.out.println("arreyi degistirince list" + siniflist);
        siniflist.set(0,"utku");
        System.out.println("listi degistirince list ="+ siniflist);// list degismesine ragmen
        System.out.println("listi degistirince arrey="+Arrays.toString(arr));//arreyde degisir






    }
}
