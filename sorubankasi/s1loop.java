package sorubankasi;

public class s1loop {
    public static void main(String[] args) {
        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satıra yazın
        //ardışık iki tam sayı arasında boşluk olan

   String s=" ";
        for (int i = 120; i>10 ; i--) {
            if(i%6==0&&i%4==0){
                System.out.print(i+s);
            }

        }


    }
}
