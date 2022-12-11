package practisday2;

import java.util.Locale;

public class day02_switcCase {
    public static void main(String[] args) {
/*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String gun = "pazar".toLowerCase();
        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("java dersi");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("sql dersi");
                break;
            case "persembe":
            case "cuma":
                System.out.println("selanyum");
                break;
            default:
                System.out.println("izin gunu");


        }


    }
}
