package Practisday4tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class c05ArreysOrtalama {
    public static void main(String[] args) {

        //verilen sayilarin ortalamasini bulunuz
        int[]arr1=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("arr icin 5 deger giriniz");


        for (int i = 0; i <arr1.length ; i++) {
           arr1[i]=scanner.nextInt();

        }

        System.out.print(Arrays.toString(arr1));

        System.out.println("arr1 birinci elemani =" +arr1[0]);
        System.out.println();


    }


}
