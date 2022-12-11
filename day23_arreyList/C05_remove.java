package day23_arreyList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);//[5,3,2,1]
        sayilar1.remove(1);
        //sayilardan olusan bir list varsa java remove methodunda sayi yazdigimizde direk index olarak kabul eder
        //indexi 1 olan 3 u kaldirir
        System.out.println(sayilar1);

        //5 i silmek istiyorum
        Integer sil=5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);//SİLİNECEK OBJEYİ VARİABLEYE TANIMLARIZ
        //VEYA İNDEXOF METHODUNU KULLANİRİZ 2 yi bulmak icin ikini indexini bulup remove yazabiliriz

        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1);




    }
}
