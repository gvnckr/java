package practisday1;

public class Q03_PrimitiveDataTypes {

    public static void main(String[] args) {


/*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        int intmax= Integer.MAX_VALUE;
        int intmin= Integer.MAX_VALUE;
        System.out.println("intmin = " +intmin);
        System.out.println("intmax = " + intmax);


       long longmax=Integer.MAX_VALUE;
        long longmin= Integer.MIN_VALUE;
//
  //      System.out.println("longmax = " + longmax);
  //      System.out.println("longmin = " + longmin);



        double doublemax=Integer.MAX_VALUE;

        double doublemin=Integer.MIN_VALUE;

        System.out.println("doublemax = " + doublemax);

        System.out.println("doublemin = " + doublemin);



        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)

        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float pcfiyat=999f;
        System.out.println("pcfiyat = " + pcfiyat);
        double km=15.3;
        System.out.println("km = " + km);
        char basharf='a';
        System.out.println("basharf = " + basharf);
        boolean dogruMU=true;
        System.out.println("dogruMU = " + dogruMU);









    }
}

