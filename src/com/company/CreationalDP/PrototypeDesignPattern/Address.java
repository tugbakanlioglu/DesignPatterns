package com.company.CreationalDP.PrototypeDesignPattern;

public class Address extends AddressPrototype {
    @Override
    void draw() {
        System.out.println("Addresss");
    }

    public Address(String sokak, String no, String semt, String sehir) {
        setSokak(sokak);
        setNo(no);
        setSemt(semt);
        setSehir(sehir);
    }
}
