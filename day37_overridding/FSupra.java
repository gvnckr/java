package day37_overridding;

public class FSupra extends EToyatota {

void yakit(){

    System.out.println("supra benzin kullanir");
    /*privita methotlar ovirride edilemez eger child classda parent class daki private method ile
    ayni signaturde da bir method olusturusaniz bu overriding method olmaz

    */

}

    @Override
    void motor() {
     //@Override notasyonu javaya bir gorev verir java bu notasyonla birbirine bagli
        // iki methodu surekli kontrol eder
        //eger parent classdaki overridden methodu silerseniz cte verir
        // @Override notasyonu kullanmak mecburi degildir eger  overridding method silinirse kodun  cte
        // vermesini istersek  @Override notasyonunu kullanmaliyiz
        System.out.println("sirali 6 silidir motor kullanir");
    }
}
