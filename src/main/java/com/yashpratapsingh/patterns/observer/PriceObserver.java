package com.yashpratapsingh.patterns.observer;

public interface PriceObserver {
    // push model
    // void update(String symbol, double price);

    // pull model
    void update(MarketDataPublisher marketDataPublisher);
}