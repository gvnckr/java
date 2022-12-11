package day23_arreyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArreydenListYapma {
    public static void main(String[] args) {
        /*list ile calisirken en kotu ozellik elemanlari tek tek eklemek



         */

   Integer[] arr={2,3,4,5,6,7,9,8,5,0,3,2,0,3};
        //bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine Arrey olusturup for loop
        // ile olusturdugumuz liste tasiyabiliriz

        List<Integer>sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
        // bu islemi yapmasi icin javanin olusturdugu bir methodda var ancak bu yontemin cok yan etkisi var
        //bu sekilde olusturulan listeye add, remove gibi listede size degistiren methodlar kullanilmaz
        //aslist methodu ile olusturulan liste ve kaynak olan array birbiri ile ilisik devam ederler
        //birinde yapilan degisiklik digerine de isler


        List<Integer>sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);
        sayilar.add(5);//5 ekledik
        System.out.println(sayilar);
       // sayilar2.add(5);
       // System.out.println(sayilar2);//Exception verir

        arr[0]=20;
        System.out.println(Arrays.toString(arr));
        System.out.println("arreyde degisiklik yapinca " +sayilar2);
        System.out.println("***************************");
        List<Integer>sayilar3=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar3.add(arr[i]);

        }
        System.out.println(sayilar3);


        List<Integer>sayilar4=new ArrayList<>();

        arr[0]=15;
        arr[1]=38;


        for (int i = 0; i < arr.length ; i++) {

            sayilar4.add(arr[i]);

        }
        System.out.println(sayilar4);


    }
}
