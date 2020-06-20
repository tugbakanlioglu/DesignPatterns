package com.company.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        FactoryBuilder factoryBuilder = new FactoryBuilder();
        AbstractFactory factory = factoryBuilder.getFactory(true);
        Shape shape = factory.getShape("RECTANGLE");
        shape.draw();


    }
}
