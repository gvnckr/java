package arrays;

public class soru28_TeksayiCiftsayiKontrol {


    public static void main(String[] args) {
/*
        28----
        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
​
        Array: [1,2,3,4,5,6,7,8,9]
​
        Beklenen Çıktı:
​
        Tek Sayilar: 5
        Cift Sayilar: 4
*/

        int []arr={1,2,3,4,5,6,7,8,9};

        int teksayi=0;
        int ciftsayi=0;


        for (int i = 1; i <= arr.length ; i++) {
            if(i%2==0){
                ciftsayi++;

            }else {
                teksayi++;

            }

        }
        System.out.println("teksayilar :"+teksayi);
        System.out.println("ciftesayilar:"+ciftsayi);
    }
}
