package day30_immutuble_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-07-23T18.39
        tarihSaat.plusMonths(3).plusHours(100);
        System.out.println(tarihSaat);


        System.out.println(tarihSaat.minusDays(100).plusHours(100));




    }
}
