package com.company.PrototypeDesignPattern;

public class FirmaAddress extends AddressPrototype {
    private String firma;

    @Override
    void draw() {
        System.out.println("Firma Address");
    }

    public FirmaAddress(String sokak, String no, String semt, String sehir, String firma) {
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
