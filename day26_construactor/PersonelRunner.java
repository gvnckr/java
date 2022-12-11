package day26_construactor;

public class PersonelRunner {

    public static void main(String[] args) {


        Personel personel1=new Personel();
        System.out.println(personel1);

        Personel personel2=new Personel("ali","cin","1988","it","genel");
        System.out.println(personel2);
        Personel personel3=new Personel("veli","meli","2000");
        System.out.println(personel3);

    }
}