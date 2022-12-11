package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

       StringBuilder sb=new StringBuilder("java daha ne yapsin");

        //sonuna bisey eklemek icin append kullanilir
        sb.append("?");
        System.out.println(sb);

        //append istedigimiz stringi en sona ekler

   sb.insert(4," herseyi dusunmus ");//4 ten sonra ekler
        System.out.println(sb);

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);
sb.append("java",2,4);
        System.out.println(sb);

    }
}
