package day46_maps;

import java.util.*;

public class ReusableMethods {


    public static Map<Integer,String> mapOlustur(){
        Map<Integer,String> sinifMap = new HashMap<>();
        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Taha, Emre, JDev");
        sinifMap.put(105,"kamil, Deniz, Devops");
        sinifMap.put(106,"memo, Deniz, Tester");
        sinifMap.put(107,"veli, Deniz, Tester");



        return sinifMap;
    }
    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira=1;
        for (String each: ogrenciMap.values()
        ) {
            System.out.println(sira+ " - " + each);
            sira++;
        }
    }
    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList= new ArrayList<>();
        String[] eachArr;
        for (String each : ogrenciMap.values()
        ) {
            eachArr=each.split(", ");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;
    }


    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        //brans=bransdaki ogrenci sayisi

        Map<String,Integer>bransOgrSayiMap=new TreeMap<>();//HARF SIRASİNA GORE OLACAGİ İCİN TREE ALDİK
        Collection<String>valuescollection=sinifListMap.values();
         String[]valueArr;
         String brans;
         Integer branstakiOgrenciSayisi;
        for (String each:valuescollection

        ) {

            valueArr=each.split(", ");
            brans=valueArr[2];
          //bransin bransOgrSayiMap inde key olarak eklenip eklenmedgini kontrol etmeliz

            if(!bransOgrSayiMap.containsKey(brans)){
                bransOgrSayiMap.put(brans,1);

            }else {
              branstakiOgrenciSayisi = bransOgrSayiMap.get(brans);
              bransOgrSayiMap.put(brans,branstakiOgrenciSayisi+1);
            }

        }

        System.out.println(bransOgrSayiMap);

    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {



        Set<Map.Entry<Integer,String>> sinifListEntrySeti= sinifListMap.entrySet();
        for (Map.Entry<Integer,String> entry: sinifListEntrySeti
        ) {
            System.out.println(entry);
        }



    }
}



