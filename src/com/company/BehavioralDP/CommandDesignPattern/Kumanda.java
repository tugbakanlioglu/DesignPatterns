package com.company.BehavioralDP.CommandDesignPattern;

public class Kumanda {
    private Command [] tus = new Command[2];

    public Kumanda() {
        Televizyon tv = new Televizyon();
        tus[0] = new TvAcCommand(tv);
        tus[1] = new TvKapatCommand(tv);
    }

    public void tusla(int i){
        if(i> tus.length || i < 0){
            throw new RuntimeException("" + "Tus gecersiz!");
        }
        tus[i].execute();

    }
}
