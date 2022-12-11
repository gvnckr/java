package day43_interfaces_iteratos;

public interface I01_InterfaceBodyOlan {


    void  motor();

    public void yakit();
    public abstract String aku();
    /*
    Normal bir class da 2 tane acces modifier kullanma ihtimali yoktur.
    asagidaki method da goreceginiz gibi interface de istisani olarak bodysi olan methodlar olusturabilir
    Bu ozellik java 8 den sonra bir interfaceye yeni bir method eklememiz gerektiginde eskiden beri bu interfaceyi implement eden
    tum classlara yeni eklenen methodu ovverride etmemiz gerekirdi.
    bu ozellik sayesinde basina default veya static keyword ekleyerek interface de yeni ve bodysi olan method olustursak
    bu methodun child classlar tarafindan ovveide edilme mecburiyeti olmaz ve eskiden implement etmis claslari degistirmemeiz
    gerekmez.
    bu istisani durumdur interface icin genel kurali bozmaz
    bu methodlarin bodysi olsada bunlara concret method denmez ama ovveride edilme mecburiyeti yoktur.
    buradaki defalut kelimesi acces modifire degil istisnai durumun belirtilesi icindir
    o zman nicin 2 keyword (static ve default)
 tanimlanmistir.Bu iki farkli kelimenin amaci child classlardan bu methoda nasil erisilecgini belirlemek icindir

 static kullanilirsa child classlardan bu methoda ulasmak icin
 interfaceAdi.methodAdi yeterli olur.
 default keywword kullanilirsa methoda erismek icin obje olusturulmalidir.
      */
public default void teker(){
    System.out.println("tum arabalarin tekeri vardir");


}
public  static void direksiyon(){
    System.out.println("tum arabalrin direksiyonu vardir");
}
}
