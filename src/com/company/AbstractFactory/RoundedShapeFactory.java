package com.company.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        if(type.equals("ROUNDEDRECTANGLE")){
            return  new RoundedRectangle();
        }else{
            return new RoundedSquare();
        }
    }
}
