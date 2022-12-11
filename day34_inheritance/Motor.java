package day34_inheritance;

public class Motor extends MHonda {
       String motoradi="pcx";

    public static void main(String[] args) {


        Motor mtr1=new Motor();

        System.out.println(mtr1.motoradi);
        System.out.println(mtr1.motordegeri);
        System.out.println(mtr1.motoryili);

        System.out.println();


       mtr1.motor();
       mtr1.aku();


    }

public void motor(){
    System.out.println("pcx motoru ozel uretimdir");
}

public void ozelsigorta(){
    System.out.println("pcx ozel sigortalidir");
}
}






