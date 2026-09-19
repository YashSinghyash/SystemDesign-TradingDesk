package com.yashpratapsingh.patterns.proxy;

public class RealTradeReport implements TradeReport{

    private String symbol;

    public RealTradeReport(String symbol) throws InterruptedException {
        this.symbol = symbol;
        System.out.println("Crunching historical data " +  symbol + "...");
        Thread.sleep(1000);
    }

    @Override
    public void display() {
        System.out.println("Report for "  + symbol  + " :[Detailed trade history]");
    }
}
