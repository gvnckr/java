package day33_encapsilation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen orr1=new Ogretmen();

        orr1.setIsim("tulay");
        // bu yontemde data hidding degil daha anlasilir kod amaclanmis olur
        System.out.println(orr1.getIsim());





    }
}
