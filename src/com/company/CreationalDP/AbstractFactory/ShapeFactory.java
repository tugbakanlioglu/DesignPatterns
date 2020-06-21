package com.company.CreationalDP.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        if(type.equals("RECTANGLE")){
            return new Rectangle();
        }else {
            return new Square();
        }
    }
}
