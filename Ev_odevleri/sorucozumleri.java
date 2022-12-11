package Ev_odevleri;

import java.util.Scanner;

public class sorucozumleri {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int v1,v2,f;
        float ort;

        System.out.println("lutfen v1 giriniz");
        v1=scan.nextInt();
        System.out.println("v2 giriniz");
        v2=scan.nextInt();
        System.out.println("final notu giriniz");
        f= scan.nextInt();
           ort=(float) (1*0.3 + v2*0.3 + f*0.4);
        System.out.println("ortalama : "+ort);
           if (ort>=50){
               System.out.println("gecti");

           } else if (ort>=40 && ort<=50) {
               System.out.println("sartli gecti");
           }else {
               System.out.println("kaldi");
           }


    }
}