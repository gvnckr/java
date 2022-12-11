package day17_nestedForLoopOdev;

public class c07_degerlerToplami {


    //kullanicidan alinan sayinin rakamlari toplami

    public static void main(String[] args) {


        int i=1;
        int input=10;
         int toplam=0;
        while (i<input){
            toplam+=i;
            i++;
        }


        System.out.println(" sayilar toplami = " + toplam);
    }
}
