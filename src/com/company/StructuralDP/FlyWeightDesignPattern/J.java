package com.company.StructuralDP.FlyWeightDesignPattern;

public class J implements Piece {
    private String label;

    public J() {
        this.label="J";
    }

    @Override
    public void create(String color, int speed, boolean irreversible) {
        System.out.println("Piece is " + label + ", color: " + color + ", speed: " + speed + ", irreversible: " + irreversible);

    }
}
