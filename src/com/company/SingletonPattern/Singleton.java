package com.company.SingletonPattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){

        synchronized (Singleton.class){// for thread safety
            if(instance == null){
                instance = new Singleton();
            }
        }

        return instance;
    }
}
