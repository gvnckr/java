package day32_stringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {
        //verilen bir inputu tersine cevirip bize donduren bir method olusturun
        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun
   String input="hey gidi for loop gunleri";
   String tersinput=tersinecevir(input);

        System.out.println(tersinput);

    }

   public static String tersinecevir(String input) {

    StringBuilder sb=new StringBuilder(input);
    return sb.reverse().toString();

    }
}
