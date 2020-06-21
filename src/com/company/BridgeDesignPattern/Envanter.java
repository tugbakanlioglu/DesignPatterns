package com.company.BridgeDesignPattern;

public abstract class Envanter {
    Uretim uretim ;

    abstract void produce();

    public Envanter(Uretim uretim) {
        this.uretim = uretim;
    }

    public Uretim getUretim() {
        return uretim;
    }

    public void setUretim(Uretim uretim) {
        this.uretim = uretim;
    }
}
