package day33_encapsilation;

public class Araba {
    String marka="marka belirtilmedi";//markanin acces modifiri default acces modifiri oldugundan package icinde kullanilir
    //privita yaptigimiz model ve yakit variablelerini yetkilendilrelim
    //modele deger atansin ama gorulemesin(setter)
    //yakit ise gorulsun ama yeni deger atanamasin(getter)
    //bunun icin
   private String model="model belirtilmedi";
    private String yakit="Elektrikli";//tum arabalar elektrikli ise bu variablenin degistirilmemesi lazim


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;


    }





}

