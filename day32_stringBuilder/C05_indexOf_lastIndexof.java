package day32_stringBuilder;

public class C05_indexOf_lastIndexof {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("pay attention please");

        System.out.println(sb.indexOf("pay"));//0
        System.out.println(sb);//pay attention please

        System.out.println(sb.indexOf("e"));
        System.out.println("sb.indexOf(\"e\",10) = " + sb.indexOf("e", 10));
        System.out.println(sb.lastIndexOf("e"));//19
        System.out.println(sb.lastIndexOf("e",10));//



    }
}
