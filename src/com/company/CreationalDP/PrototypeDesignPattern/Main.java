package com.company.CreationalDP.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        final Address address = new Address("Atatürk Sokak","12","Anıttepe","Ankara");
        address.printAddress();

        Address address1 = (Address) address.clone();
        address1.setSokak("İleri");
        address1.setNo("13");
        address1.setSemt("Anıttepe");
        address1.setSehir("İstanbul");
        address1.printAddress();

        final FirmaAddress firmaAddress = new FirmaAddress("Atatürk Sokak","12","Anıttepe","Ankara","Saglik Bakanligi");
        firmaAddress.printAddress();

        FirmaAddress firmaAddress1 = (FirmaAddress) firmaAddress.clone();
        firmaAddress1.setSehir("İstanbul");
        firmaAddress1.printAddress();


    }
}
