package day23_arreyList;

import java.util.ArrayList;
import java.util.List;

public class c01_ArreyList {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println("listenin boyutu ="+sayilar1.size());
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);
        sayilar1.set(2,8);  //indeksi 2 olani 8 yap
        System.out.println(sayilar1);
        System.out.println(sayilar1.set(0,12));//hem sıfırıncı indeki12 yapacak hemde hemde sildigi elemaani getirir
        System.out.println(sayilar1);//sayilarin yeni halini getirir
        //set methodu istenen indexdeki eski elementi silip yerine verilen yeni elementi set eder
        //eger eski elemnti silmek istemiyorsak add Methodu (index,deger )kullanilir
        //set() methodu sildigi eski elemnti bize dondurur
    }
}
