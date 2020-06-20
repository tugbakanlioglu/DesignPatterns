package com.company.FactoryPattern;

public class Product1 implements IProduct {
    @Override
    public String shipFrom() {
        return "Product1";
    }
}
