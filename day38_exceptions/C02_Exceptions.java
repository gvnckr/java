package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {



        int a =1000;
        int b=50;
        int sayac=1;
        while (sayac<100){

            //try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak icin kullanilir
            //cath den sonraki parantez karsilasmayi beklediigimiz exception turunu java ya soylemek icin kullanilir
            //ve catch blogu java ya soyledigimiz exception (istisna) durum gerceklesirse javanin yapmasini istedigimiz islem
            //catch blogunun onundeki paranteze karsilasmayi bekledigimiz exceptionu yazabilir veya her turlu exceptionda
            // devreye girmesini istiyorsak tum exceptionlarin parenti olan exception yazabiliriz
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda sifir oldu dikkatli ol");
            }


            b--;
            sayac++;
        }







    }
}
