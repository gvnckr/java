package day30_immutuble_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time=LocalTime.now();
        System.out.println(time);//saati verir
        //bizim olusturdugumuz date ve time canli saat degildir.LocalTime.Now kullandigimizda
        //bizim variablemize store eder
        //time variablenin degeri SABİTTİR



        Thread.sleep(3000);//3 saniye bekletir
        System.out.println(time);










    }
}
