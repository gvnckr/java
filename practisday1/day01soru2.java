package practisday1;

import java.util.Scanner;

public class day01soru2 {

    public static void main(String[] args) {







        Scanner scan=new Scanner(System.in);

        System.out.println("y yada n giriniz");
        char harf=scan.next().toUpperCase().charAt(0);

        if (harf=='Y' || harf=='y'){
            System.out.println("YES");
        } else if (harf=='N'||harf=='n') {
            System.out.println("NO");

        }else
              System.out.println("yanlis giris yaptiniz");



    }

}
