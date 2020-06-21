package com.company.StructuralDP.BridgeDesignPattern;

public class Kalem extends Envanter {

    public Kalem(Uretim uretim) {
        super(uretim);
    }

    @Override
    void produce() {
        produceKalem();
    }

    private void produceKalem() {
        getUretim().produceKalem();
    }
}
