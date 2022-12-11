package day11_Stringmanipilation;

public class c07_startWith {
    public static void main(String[] args) {



        String input="Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("J")); // true
        System.out.println(input.startsWith("")); // true
        System.out.println(input.startsWith("gun",5)); //tru


        System.out.println(input.indexOf("mek"));
        System.out.println(input.indexOf("ce"));
        System.out.println(input.indexOf("g,   6+1"));
        int ilke= input.indexOf("ilke");
        int ikincie=input.indexOf("e", ilke+1);

        if (ikincie==-1){
            System.out.println("ikici e yoktur");
        } else {
            int ucuncue=input.indexOf("e",ikincie+1);
          if (ucuncue==-1){
              System.out.println("ucuncu e yoktur");
          }
            System.out.println("3.e nin indexi "+ ucuncue);









    }
}
}
