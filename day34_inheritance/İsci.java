package day34_inheritance;

public class İsci extends Personel {
    /*
    normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    java da ise child classlar ozelliklerini inherit etmek
    istedikleri classi kendilerine parent edinebilir.

    mesela isci classini olusturunca nelere ihtiyaci var diye
    dusunsek personel classindaki tum variable ve methodlara ihticayi oldugunu gorebiliriz
    bu durum da personel classini kendimize parent ediniriz.

    Bir classi parent edinmek icin extends keyword kullanmaliyiz.
    bir class baska clasi parent edindiginde
    1. parent clasdaki tum ozelliklere sahip olur
    2 parent clasdaki bazi ozellikleri kendine uyarlayabilir
    3.parent classda olmayan bazi ozellikleri olusturabilir
    Not: parent clasdaki ozelliklerden hic birini reddedemez ama degistirebilir

     */
    int persNo=1001;
    public static void main(String[] args) {


        İsci isci1=new İsci();
        System.out.println(isci1.isim);//
        isci1.isim="selim";//kendi clasimizda isim variablesi yok onun icin
        //parente gider
        System.out.println(isci1.persNo);//1001 yazar kendi classimizda varsa onu kullaniriz

 isci1.maas();//"tum personelin maasi vardir

    }
public void maas(){
    System.out.println("isciler minimum 15 euro saat ucreti alir");
}

public void ozelSigorta(){
    System.out.println("iscilerden isteyene %50 indirimli sigorta yapilir");
}

}
