package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {


        Car car1=new Car();


        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="toyota";
        System.out.println("marka :" +car1.marka +"\nmodel :" +car1.model+"\nyil :"+car1.yil +"\nfiyat:" +car1.fiyat);

        Car car2=new Car();
        System.out.println("Car 2 ozellikler \nmarka :" +car2.marka +"\nmodel :" +car2.model+"\nyil :"+car2.yil +"\nfiyat:" +car2.fiyat);
   // herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda java degeri su siralam ile arar
        //ilk once o obje olusturulduktan sonra bir deger atandi mi ?
        // objenin olusturuldugu class da variable de bir deger atanmis mi bakar
        // o zman data turune gore java default degeri atar
    }
}
