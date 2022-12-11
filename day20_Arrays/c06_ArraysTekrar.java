package day20_Arrays;

import java.util.Arrays;

public class c06_ArraysTekrar {

    public static void main(String[] args) {
        int sayilar2[]={1,2,3,4,5};

        int sayilar[]=new int[6];


        System.out.println(Arrays.toString(sayilar2));

   String str="java cok guzel";
        System.out.println(str);

        System.out.println(Arrays.toString(sayilar));


   String[] kelimeler= str.split("a");
        System.out.println(Arrays.toString(kelimeler));
     String[]kelimeler2=str.split(" ");
        System.out.println(Arrays.toString(kelimeler2));

        String[]eleman={"Ali","veli","ayse","fatma"};
        eleman[0]="can";
        eleman[2]="gul";
        System.out.println(Arrays.toString(eleman));

         Arrays.sort(sayilar2);


        System.out.println(Arrays.binarySearch(sayilar2,3));


        System.out.println("***************************");

        Arrays.sort(sayilar2);


        System.out.println(Arrays.binarySearch(sayilar2,2));
        System.out.println(Arrays.binarySearch(sayilar2,6));


      int arr[]={3,5,7,8};
      int toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            toplam+=arr[i];

        }

        System.out.println(toplam);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }


        int arr2[]={13,25,8,14,9};

        Arrays.sort(arr2);


        for (int j = arr2.length-1; j>0; j--) {

            System.out.print(arr2[j] + " ");

        }


  }




}
