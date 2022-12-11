package day26_construactor;

public class Kamyon {

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String markaK, String modelK, int yilK, int fiyatK) {
  marka=markaK;
  model=modelK;
  yil=yilK;
  fiyat=fiyatK;
    }
public Kamyon(){

}

    public Kamyon(String scania, String s540) {


    }

    @Override
    public String toString() {
        return
                "\nmarka=" + marka +
                " \nmodel=" + model +
                "\n yil=" + yil +
                " \nfiyat=" + fiyat ;
    }




}

