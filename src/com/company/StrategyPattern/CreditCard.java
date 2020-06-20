package com.company.StrategyPattern;

public class CreditCard implements Strategy {
    @Override
    public void pay() {
        System.out.println("pay with credit card");
    }
}
