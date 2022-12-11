package day35_inheritancedeCosturactorLullanimi;

public class Child extends BParent {
    String isim="Child isim belirtilmedi";
    protected  String ChildKlupAdi="Child kulubu";

    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {


        AGrandParent gp1=new AGrandParent();

        //BU OBJE GRANDPA yi calistirir
        //PARENt ve child cons calismaz

Child child1=new Child();
child1.grandpaKlupAdi="Child1";
child1.ParendpKlupAdi="child2";


       //child1 objesi icin child objesi calistirir
        //java da bir classi kullanabilmek icin o classdan obje olusturur dolasiyisyla o classin constractirini kullanirdik

        // java inheritance de parent classlardaki ozellikleri kullanabilmek icin o
        // classlarin constructorlarini otamatik calistiran bir yapi kurmustur.

        //ornegin biz child clasinda kendi classimizdan bir obje olusturmak istedgimizde child consturactorunu  kullaniriz

        //java child constroctorunu gordugunde once parentin constractırını calistirmam lazim der
        //buradan parent constractıra gider parent classinda parent constracturunu gorunce once bunun parentini
        // yani grandparent constractori calismasi gerekir der
        // boylece extends keyword olmayana kadar gider ve oradan baslayarak asagi dogru caltirir.

    }

}
