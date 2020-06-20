package com.company;

public class Test {
    static {
        System.out.println("static blok");
    }

    {
        System.out.println("inner blok");
    }

    public Test() {
        System.out.println("const ");
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}
