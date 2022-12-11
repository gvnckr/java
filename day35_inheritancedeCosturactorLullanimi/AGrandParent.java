package day35_inheritancedeCosturactorLullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmmedi";

    //Her class da gorunmese bile bir consturactir vardir bu classdan obje
    // olusturmak istedigimizde default constractor devreye girecektir
    //default constructoru goremeyecegimiz icin onun yerine parametresiz constractor kullanilir

 protected  String grandpaKlupAdi="Grandpa klubu";
    AGrandParent(){
        System.out.println("Grandpa constructor calisti");
    }

}
