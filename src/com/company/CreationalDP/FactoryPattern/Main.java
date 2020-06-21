package com.company.CreationalDP.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        IProduct product1 = creator.factoryMethod(ProductType.PRODUCT1);
        System.out.println(product1.shipFrom());

        IProduct product2 = creator.factoryMethod(ProductType.PRODUCT2);
        System.out.println(product2.shipFrom());

        IProduct product3 = creator.factoryMethod(ProductType.PRODUCT3);
        System.out.println(product3.shipFrom());
    }
}
