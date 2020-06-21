package com.company.BehavioralDP.StrategyPattern;

public class Paypall implements Strategy {
    @Override
    public void pay() {
        System.out.println("pay with pay pall");
    }
}
