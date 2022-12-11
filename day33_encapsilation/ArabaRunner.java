package day33_encapsilation;

public class ArabaRunner {
    public static void main(String[] args) {
        //arb 1 objesi uzerinden marka variablesine ulastik degirtirdik(set) yazdirabildik(get)

        Araba arb1=new Araba();
        arb1.marka="toyata";
        System.out.println(arb1.marka);
//acces modifier kullanarak marka variablesine ulasimini tamammen serbest yapabilir yada tamamen engellenebilir
        //privite yaptigimiz modele ise hic ulasamayiz

        //yani acces modifier yap hep ya hic diyor
        //markayi degistirelim ama goremeylim
        //yakiti gorelim ama degistiremeyelim
        //SET VE GET yetkilerini ozel olarak tanimlamak isterseniz 1. adim ozel yetki tanimlayacaginiz variableleri pravite yapin
        //private bir dataya baska claslardan ulasmak mumkun olmadigindan
        //2 adım set yetkisi icin setter get yetksisi icin getter yetkisi olusturalim

arb1.setModel("coralla");//model olarak coralla atadik
        //modeli yazdirma imkanimiz yok cunku getter yok
        System.out.println(arb1.getYakit());//elektrikli bilgisine ulastik
        //yaikiti degistiremeyiz cunku setter methodu yok

    }


}
