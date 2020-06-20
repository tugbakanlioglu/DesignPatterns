package com.company.FactoryPattern;

public class Creator {
    public IProduct factoryMethod(ProductType productType){
        IProduct product = null;
        switch (productType){
            case PRODUCT1:
                product = new Product1();
                break;
            case PRODUCT2:
                product = new Product2();
                break;
            case PRODUCT3:
                product = new Product3();
                break;
        }
        return product;
    }
}
