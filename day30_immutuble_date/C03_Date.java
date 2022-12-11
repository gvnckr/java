package day30_immutuble_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.isLeapYear());
        LocalDate tarih2= LocalDate.of(2001,5,15);
        System.out.println(tarih2);
LocalDate tarih3= LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3);
        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(10));

        System.out.println(tarih.minusWeeks(20));//20 hafta once
        System.out.println(tarih.minusDays(50));//50 gun once


        System.out.println(tarih.isAfter(tarih2));//tarif tarih2 den oncemi//true
        //iki farkli dogum unu girildiginde hangisinin daha buyuk oldugunu bulunuz

        //tarih2 ve tarih3 icin bunu yapalim
        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else{
            System.out.println("iki tarih birbiri ile ayni");
        }


    }
}
