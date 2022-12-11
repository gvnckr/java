package day42_abstractionclassveİnterface;

public interface I03_Interface {

   /*
    int sayi; calismaz
    interfacelerde tum varibaleler public static finalydir
    bunun icin variablelere deger atamaliyiz sonradan deger atama sansimiz yoktur

    inherit etmek icin

    */
  int sayi=20;

  void  yakit();
/*
ınterface icindeki her method puclic abstract ozelliklere sahiptir

abstract bir methodun badisi olmasi mumkun degildir.
java sonradan devololoperlerin istegi uzerine kısmi bir update yapmistir
bi iterfaceye sonradan bir abstrackt method eklerseniz o ınterfaceyi daha once ımplemnt etmis tum clasllara gidip
hepsinde yeni eklenen methodu ovverride etmeniz gerekir
bu da buyuk ve eskiden gelen projeler icin zor bir islemdir bunun icin java8 den itibaren ınterfacelere sonradan badisi olan method eklenmesine
izin vermistir.
bu methodlarin badisi olsada interface yapisi geregi bu methodlara concrete denmez
bu badisi olan methodlar istisna olarak kabul edilebilir

 */
   public void motor();
   public abstract void teker();
   static public  void aku(){

   }
}
