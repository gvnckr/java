package day21_Arrays;

import java.util.Arrays;

public class c06_Short {
    public static void main(String[] args) {

        int[]sayilar={5,7,1,5,4,7,9};
        //Arrayi Arrays clasini kullanarak  natural sırali hale getiririz

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
}
