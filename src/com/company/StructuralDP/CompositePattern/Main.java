package com.company.StructuralDP.CompositePattern;

public class Main {
    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        textFile.setSize(200);

        TextFile textFile2 = new TextFile();
        textFile2.setSize(100);

        Directory directory = new Directory();
        directory.addFile(textFile);
        directory.addFile(textFile2);

        System.out.println(directory.getSize());
        System.out.println(textFile2.getSize());

    }
}
