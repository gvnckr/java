package day27_staticKeyword;

public class C01 {

    static  int sayi=10;
    int rakam=5;

    public static void main(String[] args) {

        //static (class)varibale
        //instance(obje)variable
        //class level da iki tur variable olusturabilirz
        //static variableler tum classdan kullanilirken instance olanlar static olmayan direk methodlardan kullanilir
        //instance variablelere static methoddan ulasmak icin obje olusturulur.
        //instance variableler obje variable oldugu icin herahngi bir satirda instance variablenin degerinin ne
        // oldugunu bulmak icin obje olusturulan satirdan itibaren kod incelenmelidir.
        //static variableler class variable oldugu icin herahngi bir satirda
        // herhangi bir satirda variablenin degerini bulmak icin CLASSİN basindan itibaren kod incelenmelidir



        C01 obj1=new C01();
        System.out.println("obj1in rakam degeri="+obj1.rakam);
        System.out.println("obj1 in sayi degeri="+sayi);
        obj1.rakam+=1;//5 di 1 ekledim 6 yazdirir
        obj1.sayi+=1;//sayinin degeri bi artmis 10 du 1 //11 oldu

        System.out.println("obj1in rakam degerini 1 artirince ="+obj1.rakam);
        System.out.println("obj1 in sayi degeri 1 arttirdiktan sonra="+sayi);

        C01 obj2=new C01();

        System.out.println("obj2in rakam degeri="+obj2.rakam);
        System.out.println("obj2 in sayi degeri="+obj2.sayi);
        obj2.rakam++;//6
        obj2.sayi++;//12
        System.out.println("obj2nin rakam degerini 1 artirince ="+obj1.rakam);
        System.out.println("obj2nin sayi degeri 1 arttirdiktan sonra="+sayi);
    }



}
