package Ev_odevleri;

public class days11_odevler {

    public static void main(String[] args) {

          //verilen kelime icin asagıda uygun olanlari yazidiriniz
          //verilen kelime cumlede kullanilmamis
         //verilen kelime cumlede bir kere kullailmis
        //verilen kelime cumlede birden fazla kullanilmis

        String cumle="java cok guzel java cok kolay";
        String kelime="java";

        int kelimeilkindex=cumle.indexOf(kelime);
        int kelimesonindex=cumle.lastIndexOf(kelime);

        if (kelimeilkindex==-1){
            System.out.println("cumlede kullanilmamis");
        } else if (kelimeilkindex==kelimesonindex) {
            System.out.println("bir defa kullanilmis");

        }else {
            System.out.println("birden fazla kullanilmis");
        }

        System.out.println(kelime.contains("java"));
        System.out.println(kelime.contains("a"));
        System.out.println(kelime.contains("leo"));
        System.out.println(kelime.contains("vale"));

    }
}
