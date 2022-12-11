package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        System.out.println("static block calisti");
    }

    //static blok class uyelerinin tamamindan once calisir(main methoddan da once) static blok class olusturuldugunda
    // calisir genelliklede classla ilgili on ayarlar ve static variabelelere deger atamak icin kullanilir
   //static bloklarin class icinde nerde oldugu onemli degildir once static bloklar calisir
    //birden fazla varsa yukaridan asagi calisir

    public static void main(String[] args) {

        ;
        System.out.println("main method calisti");
        System.out.println(sayi);


    }

static {
    System.out.println("2.static blok");
}


}
