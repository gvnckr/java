package day37_overridding;

public class EToyatota extends DAraba{
    void marka(){
        System.out.println("markamiz toyota");
        //hem overriden hemde overriding methodunun calismasini istersek
        //ilk satira super.marka() yazabiliriz
    }
void motor(){
    System.out.println("toyota araclar toyota marka motor kullanir");
}

}
