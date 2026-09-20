package com.yashpratapsingh.patterns.iterator;

public class Holding {
    String symbol;
    int quantity;

    public Holding(String symbol , int quantiy){
        this.symbol = symbol;
        this.quantity = quantiy;
    }

    public String getSymbol() {return symbol;}
    public int getQuantity() { return quantity;}

}
