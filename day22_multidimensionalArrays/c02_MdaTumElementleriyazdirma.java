package day22_multidimensionalArrays;

public class c02_MdaTumElementleriyazdirma {
    public static void main(String[] args) {

        // verilen bir multi-dimensional array'in
// tum elementlerini yazdiran bir method olusturun

        int[][] sayilar = {{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);



    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i <sayilar.length ; i++) { //i=0,1,2 degerlerini alir
            for (int j = 0; j < sayilar[i].length; j++) {   //inner aarreyin uzunluguna bagli
                System.out.print(   sayilar[i][j]+ " ");
            }
        }


    }
}
