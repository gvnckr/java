package day36_inheritenceDataTypeKullanimi;

public class APersonel {

    protected String isim="isim belirtilmedi";
    protected   String soyisim="soyisim belirtilmedi";
    protected String departmant="departman belirtilmedi";

    protected void maas(){
        System.out.println("tum personel maas alir");
    }

    protected void sigorta(){
        System.out.println("tum personele sigorta yaplilir");
    }
}
