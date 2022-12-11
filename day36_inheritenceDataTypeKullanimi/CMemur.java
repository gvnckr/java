package day36_inheritenceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {

    protected  int saatUcreti=12;
    protected  int gunlukMesai=9;

    protected void maas(){
        System.out.println("memurlar :"+(30*saatUcreti*gunlukMesai)+"maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("memurlar %60 indirimli ozel sigorta yaptirabilir");
    }


    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//bu classa varsa 9 yazar

        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();//memurlar :3240maas alir
        mmr1.ozelSigorta();//memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.ozelSigorta();//personelden alir
        System.out.println(mmr1.isim);//personel clas
        System.out.println(mmr1.soyisim);//personel
        System.out.println(mmr1.departmant);

        BMuhasebe mhsb1=new BMuhasebe();
        // Bİz HER NEKADAR MEMUR CLASSİNDA OLSAKDA OLUSTURULAN OBJE MUHASEBE CLASSINDAN
        // CUNKU DATA TURU VE CONSTURACTIR BMUHASEBE
      /*
        String str="murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe classi da obje olusturulan bir classdir yani bir data turudur



        */

        BMuhasebe mhs1= new BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */
        System.out.println(mhsb1.gunlukMesai); // 8  Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Muhasebe Personel minumum : 2400 maas alir
        mhsb1.ozelSigorta(); // Muhasebe Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta(); // Personel Tum personelimiz sigorta yapilir
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departmant);//Person
    }



}
