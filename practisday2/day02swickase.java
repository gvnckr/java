package practisday2;

public class day02swickase {
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

          String input="carsamba";
          input=input.toLowerCase();

          switch (input){
              case "pazartesi":
              case "sali":
                  System.out.println("java dersi");
                  break;
              case "persembe":
              case "cuma":
                  System.out.println("selanyum dersi");
                  break;
              case "carsamba":
              case "cumartesi":
                  System.out.println("sql dersi");
                  break;
              default:
                  System.out.println("gecerli bir gun giriniz");
          }













    }
}
