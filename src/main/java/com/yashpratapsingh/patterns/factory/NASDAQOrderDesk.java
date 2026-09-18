package com.yashpratapsingh.patterns.factory;

public class NASDAQOrderDesk extends OrderDesk{


    public NASDAQOrderDesk() {
        super(new NASDAQExchangeFactory());
    }

    @Override
    Order createOrder(String type) {
        if (type.equalsIgnoreCase("MarketOrder")) return new NASDAQMarketOrder();
        else return new NASDAQLimitOrder();
    }
}
