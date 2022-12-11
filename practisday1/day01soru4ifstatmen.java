package practisday1;

import java.util.Scanner;

public class day01soru4ifstatmen {
    public static void main(String[] args) {

        System.out.println("lutfen is unvani giriniz");

        Scanner scan=new Scanner(System.in);
        String jobtitle=scan.nextLine().toLowerCase();

        if (jobtitle.equals("qa")){
            System.out.println("qualty analist");
        } else if (jobtitle.equals("dev")) {
            System.out.println("devolaper");
        } else if (jobtitle.equals("ba")) {
            System.out.println("busines analist");
        } else if (jobtitle.equals("pm")) {
            System.out.println("project analist");
        }else
            System.out.println("yanlis giris");


        switch (jobtitle){
            case "qa":
                System.out.println("Qality Analist");
                break;
            case "dev":
                System.out.println("developer");
                break;
            case "ba":
                System.out.println("busines analist");
                break;
            case "pm":
                System.out.println("project manager");
                break;
            default:
                System.out.println("yanlis giris");
                break;
        }




    }

}
