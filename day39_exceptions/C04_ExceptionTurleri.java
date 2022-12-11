package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {


        String str;
       // System.out.println(str); deger atamasi yapmadan bir variableyi kullanmaya calisirsaniz java compile Time de
        // fareder ve size izin vermez


        str=null;
        //System.out.println(str.length());// NullPointerException deger olmadigi icin null verir( runtime)
        Object obj="java java java";
        Integer sayi=(Integer)obj;

        String str2="hava civa";
        //java bazi casting islemlerine compile time da izin vermez
        //ancak bazen syntx uygun olabilir ama ClassCastException hatasi verir.
  Thread.sleep(5000);// 5 saniye bekletir


    }

}
