package com.yashpratapsingh.patterns.command;

public class TradingAccount {

    void buy(String symbol , int qty){
        System.out.println("Bought " + symbol + " " + qty  + " quantities");
    }
    void sell(String symbol , int qty){
        System.out.println("Sold " + symbol + " " + qty  + " quantities");
    }
}
