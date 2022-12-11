package day40_final;

public abstract class CAbstract {

    // class basina abstract yazilir
    // methodlarla ilgilidir
    // amaci olmasi gerekir


    void  toplama(){
        System.out.println("bu method toplama yapar");
    }
    //method badisi olmasada basina abstract yazarsaniz bu methodun child classlar icin
    //bir standart oldugunu deklare etmis olursunuz ve methodbadisine gerek kalmaz
   abstract void  carpma();
    abstract  void cıkarma();

}
