package com.company.AbstractFactory;

public class FactoryBuilder {
    public AbstractFactory getFactory(boolean rounded){
        if (rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
