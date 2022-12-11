package day25_constructor;

public class C02_Constructor {
    public static void main(String[] args) {

        C01           obj1        =new               C01()       ;
   // class adi       obje adi     keyword           constructor


        System.out.println(obj1.sayi);//atanmis deger olmadigi icin 0 verir
        obj1.deneme();//C01 den deneme method  calisir


        C01 ob2=new C01();
        obj1.deneme();
    }
}
