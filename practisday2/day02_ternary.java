package practisday2;

import java.util.Scanner;

public class day02_ternary {
    public static void main(String[] args) {

/*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */


      char finalnotu='B';
      String result=finalnotu=='A'? " GAYET BASARILI" :finalnotu=='B' ? "BASARILI" :finalnotu=='C'?"HA GAYRET":"DIGERLERI";
        System.out.println("result"+ result);






    }
}
