package day14_methodcreation;

import day13_methodcraction.C04_MethodCreation;

public class c01_methodcreation {

    public static void main(String[] args) {


       terstenYazdir("okan");
        C04_MethodCreation.topla(6,5);


    }


   public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                         input.substring(1,2)+
                         input.substring(0,1);
       System.out.println("verilen kelimenin tersten yazilisi :" + tersInput);

    }






}
