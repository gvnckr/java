package day38_exceptions;

public class C01_Exception {
    public static void main(String[] args) {

/*
Bir sorun ile karsilasmayi beklediginiz durumlarda if else ile sorunu yakalayip onunla ilgili cozum uretebilirsiniz
ama  sorunu herzaman sorunu if else ile cozemeyecigi icin java try-catch bloclari olusturmus

 */

    int a =100;
     int b=50;
      int sayac=1;
     while (sayac<1000){
         if(b==0){
             System.out.println("islem yapilirken payda 0 oldu dikkat etmelisiniz");
         }else{
             System.out.println(a/b);
         }

         System.out.println(a/b);  //(C01_Exception.java:14)



         b--;
         sayac++;
     }





    }
}
