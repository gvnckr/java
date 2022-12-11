package day21_Arrays;

public class C10_soruTekrari {
    public static void main(String[] args) {
        // Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[]isimler={"erdal","onur","mehmet","hayrullah","mihrican"};
        enUzunEnkisaKelime(isimler);


    }

    private static void enUzunEnkisaKelime(String[] isimler) {

        String uzunKelime=isimler[0];
        String kisaKelime=isimler[0];


        for (int i = 1; i <isimler.length ; i++) {
            if (isimler[i].length()>uzunKelime.length()){
                uzunKelime=isimler[i];

                if (isimler[i].length()<kisaKelime.length()){
                    kisaKelime=isimler[i];
                }
            }

        }

        System.out.println(uzunKelime);
        System.out.println(kisaKelime);





    }

}
