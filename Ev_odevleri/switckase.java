package Ev_odevleri;

public class switckase {

    public static void main(String[] args) {


   /*
        Kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin
         */

           String input="pazar";
           input=input.toLowerCase();
              switch (input){
               case "pazartesi":
                   System.out.println("haftaici");
                   break;
               case "sali":
                   System.out.println("haftaici");
                   break;
               case "carsamba":
                   System.out.println("haftaici");
                   break;
               case"persembe":
                   System.out.println("haftaici");
               case "cuma":
                   System.out.println("haftaici");
                   break;
               case "cumartesi":
                   System.out.println("haftasonu");
                   break;
               case"pazar":
                   System.out.println("haftasonu");
                   break;
               default:
                   System.out.println("lutfen gecerli bir gun giriniz");


                 switch (input){
                     case "pazartesi":
                     case "sali":
                     case "carsamba":
                     case "persembe":
                     case "cuma":
                         System.out.println("haftaici");
                         break;
                     case "cumartesi":
                     case"pazar":
                         System.out.println("haftasonu");
                         break;
                     default:
                         System.out.println("gecerli bir gun giriniz lutfen" );
                 }
























    }




}
}