package Practisday5;

public class c01_forwhiledo {
    public static void main(String[] args) {

// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        for (int i = 0; i <=255 ; i++) {
            char c= (char) i;
            System.out.print(i + "->" + c);


        }

        System.out.println("while ile");
        int i=0;

        while (i<=255){
            char sembol= (char) i;
            System.out.print(i + "-" +sembol);
            i++;
        }

        System.out.println("do while ile");
   int a=0;

        do {
            char karekter= (char) a;
            System.out.print(a+" "+ karekter);
            a++;
        }while (a<=255);

    }
}
