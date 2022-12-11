package ev_calismalari;

import java.util.Scanner;

public class for_loop4 {
    public static void main(String[] args) {
        
        /*
		 *Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		  1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
			- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
			- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
			- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();


        for (int i = 1; i <=sayi; i++) {
            
        }if   (sayi%15==0)     {
            System.out.println("java");
        } else if (sayi%5==0) {
            System.out.println("guzeldir");
            
        } else if (sayi%3==0) {
            System.out.println("java guzeldir");

        }else {
            System.out.println( sayi + " ");
        }



    }
}
