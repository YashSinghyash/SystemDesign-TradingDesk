package com.yashpratapsingh.patterns.observer;

public class DashboardDisplay implements PriceObserver {

    // push model
    // public void update(String symbol, double price) {
    //     System.out.println("DashboardDisplay Updated symbol : " + symbol + " Updated price: " + price);
    // }

    // pull model
    public void update(MarketDataPublisher marketDataPublisher) {
        System.out.println("DashboardDisplay Updated symbol : " + marketDataPublisher.getSymbol() + " Updated price: " + marketDataPublisher.getPrice());
    }
}