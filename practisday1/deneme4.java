package practisday1;

public class deneme4 {
    public static void main(String[] args) {

        String isim= "Suleyman";              // String isimIlkHarf= isim.substring(0,1).toUpperCase();
                               // String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w","*");
        String soyisim= "Karanfil";
        String kartNo= "1234 6589 7458 9658";

        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring(soyisim.length()-3));
        System.out.println(kartNo.substring(4));

            String isimilkharf=(isim.substring(0,1).toUpperCase());
            String isimgeriyekalan=(isim.substring(1).replaceAll("\\w","\\*"));
        String soyisimilkharf=(soyisim.substring(0,1).toUpperCase());
        String soisimgeriyekalan=(soyisim.substring(1).replaceAll("\\w","\\*"));
        String kartilkdort=kartNo.substring(0,4);
        String kartgeriyekalan="**** **** ****";

        System.out.println(isimilkharf  +isimgeriyekalan + soyisimilkharf+soisimgeriyekalan);
        System.out.println(kartilkdort+kartgeriyekalan);










    }
}
