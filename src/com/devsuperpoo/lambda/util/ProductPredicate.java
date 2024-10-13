package com.devsuperpoo.lambda.util;

public class ProductPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
