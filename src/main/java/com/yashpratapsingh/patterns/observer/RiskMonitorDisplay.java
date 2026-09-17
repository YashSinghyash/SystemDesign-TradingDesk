package com.yashpratapsingh.patterns.observer;

public class RiskMonitorDisplay implements PriceObserver {

    // push model
    // public void update(String symbol, double price) {
    //     System.out.println("RiskMonitorDisplay Updated symbol : " + symbol + " Updated price: " + price);
    // }

    // pull model
    public void update(MarketDataPublisher marketDataPublisher){
        System.out.println("RiskMonitorDisplay Updated symbol : " + marketDataPublisher.getSymbol() + " Updated price: " + marketDataPublisher.getPrice());
    }
}