package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba {

    @Override
    public void motor() {
        System.out.println("toyota arablar cevreci motor kullanir");
    }
/*
parent classdaki standart belirleyici methotlar yani abstract methodlar child class tarafindan ovveride edilmek zorundadir
concrede methodtlarin ovveride edilme zorunlulugu yoktur
Aslinda toyota classi da obje uretecgimiz bir class degil bu durumda eger proje tasarimi yapiyorsaniz toyota clasinida
abstract yapmaniz guzel olur.
 */


    // ABSTRACT CLASSLAR CONSTRAKTİR BARİNDİR AMA OBJE URETEZLER
  //abstract bir classin ozelliklerini tasiyan bir obje olusturmak istedgimizde data turunu istedgimiz
    //abstrac class constraktor i ise childi olan concrete bir classdan seceriz

}
