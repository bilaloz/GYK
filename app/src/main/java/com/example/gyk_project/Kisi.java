package com.example.gyk_project;

public class Kisi {
    private String adi;
    private int resmi;
    private String aciklama;

    public Kisi(String adi, int resmi, String aciklama) {
        this.adi = adi;
        this.resmi = resmi;
        this.aciklama = aciklama;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getResmi() {
        return resmi;
    }

    public void setResmi(int resmi) {
        this.resmi = resmi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}



