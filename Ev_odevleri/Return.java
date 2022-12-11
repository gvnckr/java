package Ev_odevleri;

public class Return {

    public static void main(String[] args) {


        String isim="";
        String soyisim="";
        String gizliisim=isimgizle(isim,soyisim);
        System.out.println(isim +" "+ soyisim);
        System.out.println(gizliisim);

    }

    public static String isimgizle(String isim, String soyisim) {


        isim= isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyisim;

    }
}
