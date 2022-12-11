package day36_inheritenceDataTypeKullanimi;

public class BMuhasebe extends APersonel {
    protected int saatUcreti=10;
    protected int gunlukMesai=8;


    protected void maas(){

        System.out.println("personel min : "+ (30*gunlukMesai)+"maas alir");
    }

protected void ozelSigorta(){
    System.out.println("isteyen herkese ozel %50 sigorta yapilr");
}

}


