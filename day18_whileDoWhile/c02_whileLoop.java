package day18_whileDoWhile;

public class c02_whileLoop {
    public static void main(String[] args) {
        //girilen sayinin rakamlarini toplayin


        int input=5432;


        int rakamlartop=0;
        int birlerbas=0;
        int temp=input;

       while (temp>0){
           birlerbas=temp%10;
           rakamlartop+=birlerbas;
           temp/=10;
       }
        System.out.println(input + "sayisinin rakamlar toplami = " +rakamlartop);
    }
}
