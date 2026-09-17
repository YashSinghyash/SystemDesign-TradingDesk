package com.yashpratapsingh.patterns.observer;

public interface MarketDataPublisher {
    void subscribe(PriceObserver observer);

    void unsubscribe(PriceObserver observer);

    // push model
    // void notifyObservers(String symbol, double price);

    // pull model
    void notifyObservers();

    String getSymbol();
    double getPrice();
}