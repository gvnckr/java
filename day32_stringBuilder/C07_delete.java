package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("java her zman guzel");
        System.out.println(sb.delete(0,4));//her zman guzel

        //bastan baslayarak her loop da ilk harfi sil kalani yazdir


        int son= sb.length();
        for (int i = 0; i <son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }


    }
}
