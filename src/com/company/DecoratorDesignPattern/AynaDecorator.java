package com.company.DecoratorDesignPattern;

public abstract class AynaDecorator implements EvEsyalari {
    EvEsyalari ayna = new Ayna();

    public EvEsyalari getAyna() {
        return ayna;
    }

    public void setAyna(EvEsyalari ayna) {
        this.ayna = ayna;
    }

}
