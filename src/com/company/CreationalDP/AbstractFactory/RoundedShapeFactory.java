package com.company.CreationalDP.AbstractFactory;

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
