package day42_abstractionclassveİnterface;




public interface I02_Interfaces {


    // ınterface bir class degildir.
    /*

    ABSTRACT claslar java da abstraction yani (soyutlastirma) işlevini yapiyordu ancak abstract bir class da
    abstract olmayan methotlar da olabilir.

    Bu da full abstraction yapmaya izin vermez eger java da icinde hic concrete method
    olmasin degisimiz bir class olusturmak istiyorsaniz
    interface yapmalisiniz

    İNTERFACELERDE CONCRETE METHOD OLMAZ

   *  TUM ALANLARİN DOLDURULMASİ GEREKEN BİR SABLON GİBİDİR

   *  INTERFACELERDEN OBJE OLUSTURULMAZ

// list<String>list=new List<>(); ınterfece olan listten obje olusturulmaz
Bunun yerine constaktri listin childi olan ArreyList den olusur. List<String>list=new ArrayList();

   * CLASSLARDA BİR CHİLD BİRDEN FAZLA PARENT EDİNEMEZ ANCAK İNTERFACELERDE İSTEDİGİ KADAR
   PARENT EDİNİLEBİLİR

   * INTERFACELER NEYİN YAPILMASİ GEREKTİGİNİ SOYLER AMA NASİL YAPİLACAGİNA KARİSMAZ

     */
int sayi=30;
}
