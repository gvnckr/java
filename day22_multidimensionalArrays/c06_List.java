package day22_multidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class c06_List {
    public static void main(String[] args) {
        /*Arrayi array yapan senbol [] idi
        arreyListte ise <> diamond (elmas) kullanilir

         */

        List<String>isimler=new ArrayList<>();
        System.out.println(isimler);
        //BİR LİSTE eleman eklemek icin

        isimler.add("basak");
        System.out.println(  isimler.add("ayse"));//true doner
        //String de bir method calistiginda assing yapmazsak String degismiyordu
        //String isim="suleyman"
        //isim.to uppercase
        //SÜLEYMAN kalici olmaz
        //System.out.println(  isimler//basak ,ayse kalir
       //listin tek kotu tarafi Array alt yapisni kullandigi icin elamanlari birerbirer eklenmesidir.
    }
}
