package com.yashpratapsingh.patterns.factory;

// NOTE: Superseded by Factory Method (see OrderDesk, NYSEOrderDesk, NASDAQOrderDesk).
// Kept here to show the Simple Factory step in the pattern's evolution — not used anywhere.
public class SimpleOrderFactory {
    public Order createOrder(String type){
        if (type.equalsIgnoreCase("Market")) return new NYSEMarketOrder();
        else return new NYSELimitOrder(); //default if not given anything
    }
}