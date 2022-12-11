package day35_inheritancedeCosturactorLullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler (){

        System.out.println("matematik paramatresiz cons");
    }

    Matematikciler(String isim){
        this();
        System.out.println("mat paremetreli");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("TUGBA");
    }



}


