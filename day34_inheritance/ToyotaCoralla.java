package day34_inheritance;

public class ToyotaCoralla extends Toyota{

    public static void main(String[] args) {
        /*
          child class'dan parent class'a erisimde
          access modifier kurallarini bypass edemeyiz
          ornegin parent class'daki private class uyelerini child class'dan kullanamayiz
          ayni sekilde parent ve child farkli package'larda ise
          parent class'daki default access modifier'i olan
          class uyelerini child class'dan kullanamayiz
       */


        ToyotaCoralla arb1=new ToyotaCoralla();
        System.out.println(arb1.marka);
        System.out.println(arb1.model);

    }


}

