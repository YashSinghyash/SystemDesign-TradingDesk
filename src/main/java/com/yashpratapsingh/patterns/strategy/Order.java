package com.yashpratapsingh.patterns.strategy;

public class Order {
    public enum Side {BUY, SELL}
    private String symbol;
    private int quantity ;
    private double limitPrice;
    private Side side;

    public Order(String symbol, int quantity, double limitPrice, Side side) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.limitPrice = limitPrice;
        this.side = side;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getLimitPrice() {
        return limitPrice;
    }

    public Side getSide() {
        return side;
    }
}
