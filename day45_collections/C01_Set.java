package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {

    //verilen bir arreydeki tekrar eden elemtleri silip tekrarsiz halini arrye atayan bir kod yaziniz

    public static void main(String[] args) {

        int []arr={4,5,3,8,5,1,9,4,2,6,3,8,5,9,4,7,};

        Set<Integer> tekarsizSet=new HashSet<>();

        for (int each:arr
             ) {
            tekarsizSet.add(each);
        }


        System.out.println("set hali :"+ tekarsizSet);

       int []tekrarsizarr=new int[tekarsizSet.size()];

        System.out.println(Arrays.toString(tekrarsizarr));
        int i=0;
        for (int each :tekarsizSet
             ) {
          tekrarsizarr[i]=each;
          i++;
        }
        arr=tekrarsizarr;
        System.out.println("arrey hali :" +Arrays.toString(tekrarsizarr));
    }
}
