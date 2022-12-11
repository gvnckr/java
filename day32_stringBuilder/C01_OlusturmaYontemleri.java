package day32_stringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("java candir...");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println( sb1.length());//uzunluk 0
        System.out.println( sb1.capacity());//16 //hic bisey soylenmezse 16 karekter olusturur

        System.out.println( sb2.length());//11
        System.out.println( sb2.capacity());//27


        System.out.println( sb3.length());//0
        System.out.println( sb3.capacity());//10
         sb1.append("java");
        System.out.println( sb1.capacity());

        sb1.append(" candir");//16
        System.out.println( sb1.capacity());

        sb1.append("java candir,bilen bilir.");
        System.out.println( sb1.capacity());//35 yapti(16*2+2)
        StringBuilder sb4=new StringBuilder();
          sb4.append("java candir");
        System.out.println(sb4.capacity());//16
    }


}
