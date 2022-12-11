package day34_inheritance;

public class Personel {
//eger parent class olacak sekilde tasarladiginiz bir class varsa veya
    //ilerde bu classi parent yapmak isteyen olabilir diyorsaniz
    //o zman variable ve methodlarin acces modifierini proctected
    protected int persNo;
    protected String isim="isim belirtilmedi";
   protected String departman="departman belirtilmedi";


protected void maas(){
        System.out.println("tum personelin maasi vardir");
    }
protected   void mesai(){
    System.out.println("tum personel statusune gore mesai yapar");
}

protected void fazlaMesaiUcreti(){
    System.out.println("personel fazla mesaisini statusune gore alir");
}
}
