package day17_nestedForLoop;

public class c01_forLoop {
    public static void main(String[] args) {

        //verilen stringdeki kullanilan harfleri tekrarsiz olarak yazdirip kelimede kullanilan
        //farkli harf sayisini veren bir method yazdirin
        String input="java her zaman guzel";
        tekrarsizyap(input);

    }

    public static void tekrarsizyap(String input) {

        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W",""); //
        System.out.print(islenecekKelime.substring(0,1)); // E
        benzersizInput+=islenecekKelime.substring(0,1);  // E
        for (int i = 1; i <islenecekKelime.length() ; i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("input: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
}
}
