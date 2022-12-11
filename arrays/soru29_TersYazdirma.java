package arrays;

import java.util.Scanner;

public class soru29_TersYazdirma {
    public static void main(String[] args) {
/*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
​
        Test Data:
        sentence -> "Java is fun"
        reversed -> "fun is Java"
*/

        Scanner scan =new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String str=scan.nextLine();
        String[]strArray=str.split(" ");
        String tersStr="";

        for (int i = strArray.length-1; i >=0 ; i--) {
            tersStr+=strArray[i]+ " ";

        }

        System.out.println(tersStr);
        System.out.println(str.contains(tersStr));

}
}
