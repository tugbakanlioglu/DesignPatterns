package com.company.BridgeDesignPattern;

public class Defter extends Envanter {
    public Defter(Uretim uretim) {
        super(uretim);
    }

    @Override
    void produce() {
        produceDefter();
    }

    private void produceDefter() {
        getUretim().produceDefter();
    }
}
