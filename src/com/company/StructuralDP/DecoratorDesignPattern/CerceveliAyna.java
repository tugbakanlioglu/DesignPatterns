package com.company.StructuralDP.DecoratorDesignPattern;

public class CerceveliAyna extends AynaDecorator {

    @Override
    public void produce() {
        getAyna().produce();
        addBorder();
    }

    private void addBorder() {
        System.out.println("Cerceveli Eklendi!!");
    }
}
