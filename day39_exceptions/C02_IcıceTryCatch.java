package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcıceTryCatch {
    public static void main(String[] args) {
     int k;

        try {
            FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

            while ((k=fis.read()) !=-1){

                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi");
        } catch (IOException e) {
            System.out.print("dosyadan bilgiler okunamadi");
        }


    }
}
