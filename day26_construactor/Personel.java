package day26_construactor;

public class Personel {

    String isim="isim belirtilmedi";
    String soyisim="soyisim belirtilmedi";
    String dogumTarihi="tarih girilmedi";
    String brans="brans belirtilmedi";
    String yanBrans="yan brans belirtilmedi";

    public Personel() {
    }

    public Personel(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;

    }

    public Personel(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim=" + isim +
                "\n soyisim=" + soyisim +
                "\n dogumTarihi=" + dogumTarihi +
                "\n brans=" + brans +
                "\n yanBrans=" + yanBrans;

    }





}

