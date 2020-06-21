package com.company.BehavioralDP.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.setName("item1");
        item.setPrice(15);

        ShoppingCard shoppingCard = new ShoppingCard();
        shoppingCard.add(item);

        shoppingCard.pay(new CreditCard());
    }
}
