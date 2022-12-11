package Ev_odevleri;

import java.util.Locale;

public class char_swich {
    public static void main(String[] args) {


        String str="java ogrenmek cok guzel";
        System.out.println(str.charAt(0));
        System.out.println(str.toUpperCase().charAt(1));
        String str2="java tekrari yapılmali";

        System.out.println(str2.charAt(3));
        System.out.println(str2.toLowerCase().charAt(5));
        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));
        String str3="Ali can";
        String str4="ali can";
        String str5="Alİ  CAN";
        System.out.println(str3.equals(str4));
        System.out.println(str3.equals(str5));
        System.out.println(str3==str5);
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println(str.equalsIgnoreCase(str5));

        System.out.println(str3.length());
        System.out.println(str3.charAt(str3.length()-1));
        System.out.println(str3.charAt(str3.length()-3));
        System.out.println(str3.charAt(str3.length()-4));

        System.out.println(str3.length());
        System.out.println(str3.charAt(str3.length()-3));
        String str6= "java ile hayat cok guzel";

        System.out.println(str6.indexOf("a"));

        if (str6.indexOf("t")==-1){
            System.out.println("str6 da istenen karakter kullanlılmamis");
        }else {
            System.out.println("str 6 da istenen krekter kullanilmiistir");
        }


        if (str6.indexOf("r")==-1){
            System.out.println("kullanilmamis");


    }else {
            System.out.println("kullanilmis");
        }


}
}
