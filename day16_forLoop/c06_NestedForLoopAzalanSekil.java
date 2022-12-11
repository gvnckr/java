package day16_forLoop;

public class c06_NestedForLoopAzalanSekil {
    public static void main(String[] args) {
        /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        // yan yana 3 tane * yaz

        // bu tur durumlarda ic ice(Nested) loop kullanmak gerekir
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }



}
