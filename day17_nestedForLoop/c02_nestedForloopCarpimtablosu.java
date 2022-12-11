package day17_nestedForLoop;

public class c02_nestedForloopCarpimtablosu {

    public static void main(String[] args) {


        //verilen sayiya gore carpim tablosu olusturun


        int imput=4;
        for (int i = 1; i <=imput; i++) {
            for (int j = 1; j <=imput ; j++) {

                System.out.print(i*j + " ");
            }
            System.out.println(" " );
        }



    }
}
