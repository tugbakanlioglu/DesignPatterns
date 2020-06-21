package com.company.CreationalDP.PrototypeDesignPattern;

public class SahisAddress extends AddressPrototype {
    @Override
    void draw() {
        System.out.println("Sahis Address");
    }

    private String ad,soyad;

    public SahisAddress(String sokak, String no, String semt, String sehir,String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
