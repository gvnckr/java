package day18_doForLoopodev;

public class c01_soru1HarfleriYzdirma {
    public static void main(String[] args) {


     //m harfinden baslayarak c harfine kadar tum harfleri yazdirin

        char basharf='m';
        char bitharf='c';

        do {
            System.out.print(basharf + " ");
            basharf--;

        }while (basharf>bitharf);

        System.out.println("   ");

        basharf='m';

        while (basharf>bitharf){
            System.out.print(basharf + " ");
            basharf--;

        }

    }
}
