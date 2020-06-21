package com.company.StructuralDP.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        EvEsyalari ayna = new CerceveliAyna();
        ayna.produce();

        EvEsyalari ayna2 = new Ayna();
        ayna2.produce();
    }
}
