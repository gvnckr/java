package day26_construactor;

public class KamyonRunner {
    public static void main(String[] args) {


        Kamyon kamyon1=new Kamyon();

        System.out.println("kamyon1 ozellikleri="+kamyon1.toString());


        Kamyon kamyon2=new Kamyon("MERCEDES","4140",2005,50000);
        System.out.println("kamyon2 Bilgileri="+kamyon2.toString());

   Kamyon kamyon4=new Kamyon("Scania","s540");

        System.out.println("Araba4 bilileri ="+kamyon4.toString());

    }
}
