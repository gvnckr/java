package practisday1;

public class deneme2 {
    public static void main(String[] args) {



       //* 0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
       // kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
      //  cikis "Gecersiz" olmalidir
      //  NestedIf ve Ternary kullanarak 2 yolla da cozunuz



         int sayi=8;
         String sonuc="";

         if (sayi<10&&sayi>0){
             if (sayi==9){sonuc="dokuz";}
             else if (sayi==8) {sonuc="sekiz";}
             else if (sayi==7) {sonuc="yedi";}
             else if (sayi==6) {sonuc="alti";}
             else if (sayi==5) {sonuc="bes";}
             else if (sayi==4) {sonuc="dort";}
             else if (sayi==3) {sonuc="uc";}
             else if (sayi==2) {sonuc="iki;";}
             else if (sayi==1) {sonuc="bir";}
             else sonuc="gecersiz";
         }else sonuc="gecersiz";

        System.out.println("sonuc ="+sonuc);

        int n=8;

        String result= n==9 ?  "dokuz" : n==8 ? "sekiz" :n==7 ? "yedi" :n==6? "alti"
                      :n==5? "bes":n==4? "dort":n==3? "dort":n==3? "uc":n==2? "iki"
                      :n==1? "bir":"gecersiz";
        System.out.println("sonuc =" + result);












    }
}
