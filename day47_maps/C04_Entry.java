package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        // java Entry<K,v> mapin icinde bulunan her bir kaydi k=v seklinde tutar herhangi bir Entrye ulasdigimizda hem keye hem de valuye ulasabilir
        // hemde istedgimiz islemleri yapabiliriz

        // Entry.getKey() bize keyi getirir

        // Entry.getValue() bize valueyi getirir

        // Entry. setValue() bize update yaptirir
        Map<Integer,String>siniflistMap= ReusableMethods.mapOlustur();

        System.out.println(siniflistMap);

      // map in her bir elemani alt alta yazdiriniz

        Set<Map.Entry<Integer,String>>sinifEntrySet=siniflistMap.entrySet();
        for (Map. Entry <Integer,String>each:sinifEntrySet
             ) {
            System.out.println(each);

        }
// map in tum elemanlarindaki  tester kurs ismini QA olarak degisitin
     String eachValue;
        for (Map.Entry<Integer,String>each:sinifEntrySet
             ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }

        System.out.println(siniflistMap);


    }
}
