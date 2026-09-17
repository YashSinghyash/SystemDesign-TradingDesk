package com.yashpratapsingh.patterns.observer;

public class TradingAlgoDisplay implements PriceObserver {

    // push model
    // public void update(String symbol, double price) {
    //     System.out.println("TradingAlgoDisplay Updated symbol : " + symbol + " Updated price: " + price);
    // }

    // pull model
    public void update(MarketDataPublisher marketDataPublisher){
        System.out.println("TradingAlgoDisplay Updated symbol : " + marketDataPublisher.getSymbol() + " Updated price: " + marketDataPublisher.getPrice());
    }
}