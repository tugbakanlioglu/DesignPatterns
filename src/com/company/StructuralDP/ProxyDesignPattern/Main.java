package com.company.StructuralDP.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("screenShot1.png");

        image.display();
        System.out.println("");
        image.display();
    }
}
