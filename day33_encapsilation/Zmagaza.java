package day33_encapsilation;

public class Zmagaza {

    public Zmagaza() {
    }

   private String name;
 private    String bolum;
   private int calismayili;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getCalismayili() {
        return calismayili;
    }

    public void setCalismayili(int calismayili) {
        this.calismayili = calismayili;
    }

    public Zmagaza(String name, String bolum, int calismayili) {
        this.name = name;
        this.bolum = bolum;
        this.calismayili = calismayili;
    }

    @Override
    public String toString() {
        return
                "\nname=" +
                "\nbolum=" +
                "\ncalismayili=" ;
    }
}

