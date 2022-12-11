package Practisday8;

import java.util.List;

public class C04_ListForeachuzunlukyazdir {
    public static void main(String[] args) {

        // String[] liste = {"meyveler", "sebzeler", "et", "süt"};
// her döngü için diziyi yazdır
// her elemanın uzunluğunu yazdır
// Bölüm 2:
// for eachLoop kullanarak dizideki tüm öğeleri yazdırın
// Bir eleman 'v' ile başlıyorsa döngüden çık
        String[] list = {"meyveler", "sebzeler", "veji", "sut"};


        for (String element: list){
            System.out.println(element+ " :" +element.length());
        }
              {

        }
        System.out.println();
        for (String item:list){
            if (item.startsWith("v")){   //v ile baslayince donguden cik sarti
                break;

            }
            System.out.println(item);
        }
              {

        }

   }
}
