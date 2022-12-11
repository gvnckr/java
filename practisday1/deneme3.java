package practisday1;

import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {
              /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu giriniz");
        double boy= scan.nextDouble();
        System.out.println("lutfen kg giriniz");
        double kilo= scan.nextDouble();

        double bmi=kilo/(boy*boy);

        if (bmi<=20){
            System.out.println("sonuc="+bmi+" oldukca zayifsiniz");
        } else if (bmi<25) {
            System.out.println("sonuc= "+bmi+ " normal sinirdasiniz");

        } else if (bmi<30) {
            System.out.println("sonuc= "+bmi+ " sisman kategorisi");

        } else if (bmi>30) {
            System.out.println("sonuc ="+bmi+" obezzzz");

        }

        String sonuc= bmi<20? "zayif":bmi<25?"normal" :bmi<30?"sisman": bmi>30?"obez":"gecersiz";
        System.out.println(sonuc);

    }
}
