package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class soru24 {
    public static void main(String[] args) {
/*  yazılan değerin array içerisinde arayan Java Kodu yazınız.
​
    Array: [1551,1223,1443,1267,1789,1023,2020]
​
​
    Aranan Değer:2020
    Beklenen Çıktı:True
​
    Aranan Değer:2010
    Beklenen Çıktı :False

*/
        int[] arr={1551,1223,1443,1267,1789,1023,2020};

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen kontrol icin 2 sayi giiniz");
        int sayi=scan.nextInt();


     Arrays.sort(arr);
        boolean varmi=true;
        for (int i = 0; i < arr.length ; i++) {
        if(arr[i]==sayi){
            System.out.println(true);




        }

    }


    }

}







