package day18_whileDoWhile;

public class c01_whileLoopHarfleriBuyult {
    public static void main(String[] args) {

        //kullanicidan baslangic bitis harfleri alin aradaki harfleri buyuk harfle yazdirin

        char ilkharf='f';
                char sonharf='t';
                char temp=ilkharf;
                String buyult="";
                while (temp<=sonharf){
                    buyult=(temp+"").toUpperCase();
                    System.out.print(buyult + " ");
                    temp+=1;
                }


    }
}
