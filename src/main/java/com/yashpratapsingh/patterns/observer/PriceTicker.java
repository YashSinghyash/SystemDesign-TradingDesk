package com.yashpratapsingh.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PriceTicker implements MarketDataPublisher{
    private String symbol;
    private double price;
    private List<PriceObserver> observers = new ArrayList<>();


    public void setPrice(String symbol , double price){
        this.symbol = symbol;
        this.price = price;

        // push model
        // notifyObservers(symbol, price);

        // pull model
        notifyObservers();
    }

    @Override
    public void subscribe(PriceObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(PriceObserver observer) {
        observers.remove(observer);
    }

    // push model
    // @Override
    // public void notifyObservers(String symbol, double price) {
    //     for(PriceObserver observer: observers){
    //         observer.update(symbol, price);
    //     }
    // }

    // pull model
    @Override
    public void notifyObservers() {
        for(PriceObserver observer: observers){
            observer.update(this);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }
}