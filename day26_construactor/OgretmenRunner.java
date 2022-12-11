package day26_construactor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("ogretmen1 ="+ogretmen1);

        Ogretmen ogretmen2=new Ogretmen("EMRE","AKDOGAN","1985","MATEMATIK","FIZIK");
        System.out.println("ogretmen2 ="+ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("CAVIDAN","KABINKARA","01/01/1988");
        System.out.println("ogretmen3 ="+ogretmen3);
      Ogretmen ogretmen4=new Ogretmen();
        System.out.println(ogretmen4.dogumTarihi);


        System.out.println("**********************************");

        Ogretmen ogretmen5=new Ogretmen("ahmet","ali","1985");
        System.out.println(ogretmen5);


    }


}
