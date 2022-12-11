package practisday6;

public class C07_Arrays {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         *    int istenenToplam=9;
         */

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenentoplam=9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]+arr[j]==9){
                    System.out.println(arr[i]+" ve" + arr[j]+ "toplam :" +istenentoplam);
                }

            }

        }
    }
}
/*
j=i+1 oldugunda
7 ve2toplam :9
-6 ve15toplam :9
4 ve5toplam :9
2 ve7toplam :9
15 ve-6toplam :9
8 ve1toplam :9
1 ve8toplam :9
j=0 olursa 5 ve4toplam :9
5 ve4toplam :9
7 ve2toplam :9
-6 ve15toplam :9
8 ve1toplam :9

 */