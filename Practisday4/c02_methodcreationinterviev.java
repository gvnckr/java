package Practisday4;

public class c02_methodcreationinterviev {
    public static void main(String[] args) {

/*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */
  birkereYazdir("abbbbbaaccccdddee");

    }

    private static void birkereYazdir(String str) {

        String output="";//string defalt deger hiclik oldugu icin isleme etki etmemesi icin boyle atadik

        for (int i = 0; i <str.length() ; i++) {

            if (!output.contains(str.substring(i,i+1))){  //tekrarsiz karekterleri dondurecegi
                // icin sonucumuz str den aldıgımız herhangi bir karekteri icermesin

                output+=str.substring(i,i+1);      //o zmn sonuca eklesin





            }
        }


        System.out.println(output);

    }


}
