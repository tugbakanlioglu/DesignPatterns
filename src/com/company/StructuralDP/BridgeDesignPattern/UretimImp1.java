package com.company.StructuralDP.BridgeDesignPattern;

public class UretimImp1 implements Uretim {

    private Fabrika1 fabrika = new Fabrika1();

    @Override
    public void produceDefter() {
        fabrika.produceKareliDefter();
    }

    @Override
    public void produceKalem() {
        fabrika.produceTukenmezKalem();
    }
}
