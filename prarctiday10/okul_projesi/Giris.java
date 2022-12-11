package prarctiday10.okul_projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

/*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
/*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
public static void main(String[] args) {

    System.out.println("hosgeldiniz okulumuza");
    System.out.println("isim giriniz");
    Scanner scan=new Scanner(System.in);
    String isim= scan.nextLine();
    System.out.println("soyisim giriniz");
    String soyisim= scan.nextLine();

    System.out.println("yasinizi giriniz");
    int yas=scan.nextInt();
    System.out.println("bransinizi giriniz");
    String brans= scan.next();

    System.out.println("tel giriniz");
    String tel= scan.next();
    //scan.next();//damyy
    OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas,brans,tel);
    List<OgretmenBilgileri>OgretrmenList=new ArrayList<>();
  OgretrmenList.add(adayOgretmen);
    System.out.println("ogretmenLlist" +OgretrmenList);


}

}
