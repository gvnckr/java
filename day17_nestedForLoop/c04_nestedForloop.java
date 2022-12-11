package day17_nestedForLoop;

public class c04_nestedForloop {
    public static void main(String[] args) {

        /*verilen imputa gore  * lardan olusan ucgen olusturun
        ornek imput=4 ise

        *
        * *
        * * *
        * * * *

        */

        int imput=5;

        for (int i = 1; i <=imput ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }


    }
}
