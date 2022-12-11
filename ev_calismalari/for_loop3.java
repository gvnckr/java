package ev_calismalari;

public class for_loop3 {
    public static void main(String[] args) {

        // 50'den buyuk 150'den kucuk olan tamsayilardan
        // 7 ile tam bolunebilenleri toplayip
        // sonucu yazdiran bir kod yaziniz

        int sayi1=50;
        int sayi2=150;

         int toplam=0;

        for (int i = 51; i < 150; i++) {
            if (i%7==0){
               toplam+=i;

            }
        }
        System.out.println(toplam);


    }
}
