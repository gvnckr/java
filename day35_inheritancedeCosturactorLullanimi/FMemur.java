package day35_inheritancedeCosturactorLullanimi;

public class FMemur extends EMuhasebe {
    //extends keyword kullanilan classlarda ister defalut const bulunsun istersek yeni constractorlar olusturalim
    //java consturactirin ilk satirina super() consturctor call yazar.

    // super constractor call default constra. a benzer gorunmesede orada vardir calisir
    //ancak ilk satira farkli bir constracor call yazarsak java super constractorunu siler

    FMemur(){
        System.out.println("memur parametresiz const");
    }

     FMemur(String isim){

    System.out.println("memur parametreli");
}

    public static void main(String[] args) {
        FMemur mmr1=new FMemur("ALİ");

        /*

     personel parametresiz
 muhasebe parametresiz
memur parametreli

         */




    }
}
