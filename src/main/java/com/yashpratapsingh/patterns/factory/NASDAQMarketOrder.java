package com.yashpratapsingh.patterns.factory;

public class NASDAQMarketOrder implements Order {


    @Override
    public void execute() {
        System.out.println("Executing from NASDAQ MarketOrder");
    }
}
