package day21_Arrays;

public class c01_Array_MaxsayiyiBulma {
    public static void main(String[] args) {

       // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.

        int[]sayilar={3,5,7,1,4,9,5,2};
        maxSayiYazdir(sayilar);
    }

    private static void maxSayiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];

        for (int i = 1; i <sayilar.length ; i++) {
            if(sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
        }

        System.out.println("arreydeki en buyuk sayi ="+maxSayi);

    }
}
