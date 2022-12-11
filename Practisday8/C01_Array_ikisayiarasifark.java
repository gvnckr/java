package Practisday8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C01_Array_ikisayiarasifark {
    public static void main(String[] args) {
            /*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

        farkiniBul();


    }

    private static void farkiniBul() {

        Scanner scan=new Scanner(System.in);
        System.out.println("arrey uzunlugunu giriniz");
        int uzunluk=scan.nextInt();

        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Arreyin" + (i+1)+ "elemanini giriniz");//i oldugunda sıfır eleman diyecek biz index degil eleman sorduk
            arr[i]=scan.nextInt();//for i den gelen indexler bu satirda kullanici tarafindn dongu bitene kdar girilen elemanlar okunur

        }

        Arrays.sort(arr);
        System.out.println("Arreydeki en buyuk eleman ile enkucuk eleman arasindaki fark="+(arr[uzunluk-1]-arr[0]));

   //matematik classi kullanarak cozunuz
   int a=12;
   int b=4;
   int c=8;


    }


}
