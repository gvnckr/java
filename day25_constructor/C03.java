package day25_constructor;

public class C03 {
    // proje olustururken bazi klaslar run etmek icin degil variable
    // ve method olusturup bunlari baska classlardan kullanmak icin olusturulur
    //DEFAULT cons parametresizdir goremesek bile ihtiyac halinde calisir
    //***class icerisinde parametreli veya parametresiz herhangi
    // bir consturactır olusturursak java default constr yi siler ***** ( onemli)

    C03(){
        //OLUSTURDUGUMUZ PARAMETRESİZ CONSTRO DEFAULT CONSTR İLE BİREBİR AYNİDİR AMA
        // BİZ OLUSTURDUGUMUZ İCİN BUNA DEFAULT CONSTRO DEMEYİZ PARAMETRESİZ CONSTRA. DENİR


    }


   public String isim="etka";

    public void method01(){
        System.out.println("C03 method calistir");


    }
}
