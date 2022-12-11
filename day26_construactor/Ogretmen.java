package day26_construactor;

public class Ogretmen {

    String isim="isim belirtilmedi";
    String soyisim="soyisim belirtilmedi";
    String dogumTarihi="tarih girilmedi";
    String brans="brans belirtilmedi";
    String yanBrans="yan brans belirtilmedi";

    public Ogretmen() {

    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }


    @Override
    public String toString() {
        return
                "\nisim='" + isim +
                "\nsoyisim=" + soyisim +
                "\n dogumTarihi=" + dogumTarihi +
                "\nbrans=" + brans +
                "\nyanBrans=" + yanBrans ;
    }


}




