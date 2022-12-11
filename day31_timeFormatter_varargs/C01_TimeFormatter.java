package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {


        LocalDateTime tarihsaat=LocalDateTime.now();

        System.out.println("ilk olusan tarih" +tarihsaat);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf.format(tarihsaat));

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("d/MMM/yyy HH:mm ");
        System.out.println(dtf1.format(tarihsaat));
    }
}
