package com.yashpratapsingh.patterns.composite;

public class Position extends PortfolioComponent {
    String symbol;
    int quantity;

    public Position(String symbol, int quantity) {
        this.symbol = symbol;
        this.quantity = quantity;
    }

    @Override
    public void print() {
        System.out.println("Symbol: " + symbol + " Quantity: " + quantity);
    }
}