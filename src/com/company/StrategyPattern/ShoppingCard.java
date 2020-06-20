package com.company.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    List<Item> itemList = new ArrayList<>();

    public void add(Item item){
        itemList.add(item);
    }

    public void pay(Strategy strategy){
        strategy.pay();
    }
}
