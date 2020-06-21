package com.company.BridgeDesignPattern;

public class UretimImp2 implements Uretim {

    private Fabrika2 fabrika = new Fabrika2();

    @Override
    public void produceDefter() {
        fabrika.produceMuzikDefter();
    }

    @Override
    public void produceKalem() {
        fabrika.produceKursunKalem();
    }
}
