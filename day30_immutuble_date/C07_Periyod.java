package day30_immutuble_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Periyod {
    public static void main(String[] args) {

        /*

        iki tarih arasindaki sureyi bulma
         */


        LocalDate tarih1=LocalDate.of(1985,1,12);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih1,bugun);
        System.out.println(period);
        System.out.println(period.getYears());




    }
}
