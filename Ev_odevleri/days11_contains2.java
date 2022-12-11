package Ev_odevleri;

public class days11_contains2 {
    public static void main(String[] args) {

          /*
            Soru 2) Kullanicidan bir cumle isteyin.
            Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
            iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */
        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();


        if (cumle.contains("buyuk")&&cumle.contains("kucuk")){
            System.out.println("karar ver buyuk mu kucuk mu");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else if (cumle.contains("buyuk")){

        System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("cumle kucuk buyuk icermiyor");
        }

        /*
 if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu ?");
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }




        */
    }






}

