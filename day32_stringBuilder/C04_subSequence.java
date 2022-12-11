package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("kayra");
        sb.substring(0,3);
        System.out.println(sb);//kayra verir cunku bu method string dondurdugu icin strinBuilderin eski halini degistiremez
        sb.subSequence(0,3);
        System.out.println(sb);

//eger stbuilder icinde sonucu string degerler varsa degismiyor


    }
}
