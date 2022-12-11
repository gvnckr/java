package arrays;

public class Soru1 {
    public static void main(String[] args) {

        int arr[]={34};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {

           toplam+=arr[i]%10;
           arr[i]/=10;

            toplam+=arr[i]%10;
            arr[i]/=10;


        }

        System.out.println(toplam);



    }
}
