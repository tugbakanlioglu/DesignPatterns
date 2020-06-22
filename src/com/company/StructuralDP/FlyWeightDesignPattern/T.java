package com.company.StructuralDP.FlyWeightDesignPattern;

public class T implements Piece {
    private String label;

    public T() {
        this.label="T";
    }

    @Override
    public void create(String color, int speed, boolean irreversible) {
        System.out.println("Piece is " + label + ", color: " + color + ", speed: " + speed + ", irreversible: " + irreversible);

    }
}
