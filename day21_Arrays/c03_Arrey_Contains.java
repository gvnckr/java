package day21_Arrays;

import java.util.Scanner;

public class c03_Arrey_Contains {
    public static void main(String[] args) {

      //  soru 3-kullanicidan alinan bir isimin verilen array’in istenen bir elemani icerip icermedigini kontrol
        //  edip, bize true veya false sonucu donen bir method olusturun.

    String[]isimler={"basak","nurullah","fatih","adem","enes"};

        Scanner scan=new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananİsim=scan.nextLine();

        boolean sonuc= contains(isimler,arananİsim);

       if(sonuc){
           System.out.println("girilen isim var");
       }else
           System.out.println("isim yok");

    }

    private static boolean contains(String[] isimler, String arananİsim) {

        boolean sonucMethod=false;


        for (int i = 0; i <isimler.length ; i++) {
            if(isimler[i].equalsIgnoreCase(arananİsim)){
                sonucMethod=true;
            }

        }



        return sonucMethod;
    }
}

