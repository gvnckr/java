package day07_ifsatement;

import java.util.Scanner;

public class ders_soru2 {


    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasiniz giriniz");

        int yas= scan.nextInt();

        if (yas<65){

            System.out.println("emekli olamazsiniz=" +(65-yas) + "  yil calismalisin" );
        }
        else {
            System.out.println("emekli olabilirsiniz");
        }






    }
}
