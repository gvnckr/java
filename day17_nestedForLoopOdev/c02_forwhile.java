package day17_nestedForLoopOdev;

public class c02_forwhile {
    public static void main(String[] args) {

        //for ve while kullanarak 3 basamakli sayilardan 15,20,90 a bolunen sayilari yazdirin


        for (int i = 100; i <999; i++) {
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.println(i + " ");
                }
            }



         int sayi=100;
        while (sayi<999){
            if (sayi%15==0 && sayi%20==0 && sayi%90==0){
                System.out.println(sayi);
            }


        }







    }



}


