package Practisday4tekrar;

import java.util.ArrayList;

public class c06_cokluArrey {
    public static void main(String[] args) {


        int [][]arr={{10,20,30},{40,50,60}};

        int [][]arr2= new int[2][3];

        arr2[0][0]=10;
        arr2[0][1]=15;
        arr2[0][2]=12;
        arr2[1][0]=16;
        arr2[1][1]=18;
        arr2[1][2]=100;

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println("elemanlar= "+ arr2[i][j]);
            }

        }

        ArrayList<String>liste=new ArrayList<>();

        liste.add("ayse,");
        liste.add("ali");
        liste.add("ahmet");
        liste.add("mehmet");

        System.out.println(liste);
        for (int i = 0; i <liste.size() ; i++) {
            System.out.println("elemanlar =" + liste.get(i));

        }

        System.out.println(liste.get(1));
        System.out.println(liste.size());
        System.out.println(liste.clone());
        System.out.println(liste.remove(0));
        System.out.println(liste.remove("ayse"));


    }
}
