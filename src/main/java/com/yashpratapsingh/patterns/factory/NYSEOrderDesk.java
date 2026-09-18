package com.yashpratapsingh.patterns.factory;

public class NYSEOrderDesk extends OrderDesk {


    public NYSEOrderDesk() {
        super(new NYSEExchangeFactory());
    }

    @Override
    Order createOrder(String type) {
        if(type.equalsIgnoreCase("MarketOrder")) return new NYSEMarketOrder();
        else return new NYSELimitOrder();
    }
}
