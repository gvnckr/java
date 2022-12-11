package day17_nestedForLoop;

public class c03_nestedForloopDikdortgen {
    public static void main(String[] args) {


        /*verilen en boy degerlerine gore * lardan olusan bir diktortgen olusturalim
        yukselik3
        boy4
         ****
         ****
         ****
        */

        int yukseklik=4;
        int boy=8;


        for (int i = 1; i <=yukseklik; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}
