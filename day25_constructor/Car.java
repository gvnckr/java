package day25_constructor;

public class Car {
    // BU CLASS BİZİM KALİPHANEMİZ BİR ARABA OLUSTURMAK İCİN İHTİYACİMİZ
    // OLAN VARİABLE VE METHODLARİ BU CLASSDA BELİRLERİZ SONRA FARKLİ CLASSLARDA ARABA
    // OLUSTURMAMİZ GEREKİRSE BU CLASSDAN BİR OBJE OLUSTURUP BURADA BELİRLENEN VARİABLE VE METHODLARA GORE ARABA URETİRTİZ


  public   String marka="marka belirtilmedi";
   public String model="model belirtilmedi";
   public int yil;
  public   int fiyat;

    public void benzinliArac(){
        System.out.println("bu arac benzinli motora sahip");

    }
    public void maxHiz(int hiz){

        System.out.println("bu araba max "+ hiz +" sahip");
    }
}
