package com.yashpratapsingh.patterns.facade;

public class SettlementSystem {
    public void settleTrade(String symbol , int qty){
        System.out.println("Settled "  + symbol + " " + qty + " quantities");
    }
}
