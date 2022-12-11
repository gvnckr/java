package day33_encapsilation;

public class Tasit {


   private String tasitTuru;
   private boolean muaynesiVarmi;
  private   int yil;

    public String getTasitTuru() {
        return tasitTuru;
        //getter methodu da tekbir satirlik islem yapiyor baska
        // classlarin private oldugu icin
        //erisemedigi tasit turu bilgisini class icinden alip istenen
        // farkli classlara return ediyor

    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        // //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
        //    //burada bir satırlık islem yapıyor o bir satırlık islemde bizim
        //    gönderdiğimiz parametreyi instence variable a atıyor.
    }

    public boolean isMuaynesiVarmi() {
        return muaynesiVarmi;
        //boolean variableler icin olusturulan getter methodlarinin ismi
        //isvariable seklinde olur
    }

    public void setMuaynesiVarmi(boolean muaynesiVarmi) {
        this.muaynesiVarmi = muaynesiVarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
