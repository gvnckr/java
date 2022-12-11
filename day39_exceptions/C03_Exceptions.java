package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str="123a5";
        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("yazdiginiz deger satece rakamlardan olusmalidir");
        }
        catch (Exception e) {
            System.out.println("ONGORULEMEZ HATA");
        }
        System.out.println("sayinin karesi :"+ sayi*sayi);
        //kullanicidan string olarak bir deger aliyor ve bunu integere ceviriyorsak
        // numberformatexception ile karsilasacagimizi ongorururuz NFE aldıgımızda kodu try catch ile cevreleriz
        // eger bilmedigim bir exceptionla karsilaasirsak kod durmamasi icin bir catch cumlesi ekleyiz ona
        // en genis exception yazabiliriz


    }
}
