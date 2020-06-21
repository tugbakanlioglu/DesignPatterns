package com.company.StructuralDP.ProxyDesignPattern;

public class RealImage implements Image {

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading from disk!!");
    }

    @Override
    public void display() {
        System.out.println("Display Image!!");

    }
}
