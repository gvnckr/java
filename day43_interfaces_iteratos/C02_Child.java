package day43_interfaces_iteratos;

public class C02_Child implements I01_InterfaceBodyOlan {

    public static void main(String[] args) {
        I01_InterfaceBodyOlan.direksiyon();

        C02_Child obj=new C02_Child();
        obj.teker();

    }
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
// PARENT İNTERFACE DE ABSTRACT OLAN 3 METHODU İMPLENT ETTİGİMİZDE JAVA İTİRAZİ KESER





}
