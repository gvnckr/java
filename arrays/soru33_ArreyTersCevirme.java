package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru33_ArreyTersCevirme {
    public static void main(String[] args) {

/*
        33-----
                Bir arrayi tersine çeviren  method yazınız.
​
        Test Data:
​
        reverse [1, 2, 3, 4]
        return  [4, 3, 2, 1]
*/   int[]sayi={1,2,3,4};
        List<Integer> reverse=new ArrayList<>();
        for (int i = sayi.length-1; i>=0; i--) {
            reverse.add(sayi[i]);
        } System.out.println(reverse);
    }


}
