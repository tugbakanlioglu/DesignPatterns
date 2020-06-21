package com.company.BridgeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Envanter kalem = new Kalem(new UretimImp1());
        kalem.produce();


        Envanter defter = new Defter(new UretimImp2());
        defter.produce();

        Envanter defter2 = new Defter(new UretimImp1());
        defter2.produce();
    }
}
