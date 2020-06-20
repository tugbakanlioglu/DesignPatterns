package com.company.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        SiparisManager siparisManager = new SiparisManager();
        siparisManager.createOrder("Audi","A7","Siyah",400);
        siparisManager.printOrder();


    }

}
