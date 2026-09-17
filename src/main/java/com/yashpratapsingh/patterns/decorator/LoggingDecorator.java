package com.yashpratapsingh.patterns.decorator;

public class LoggingDecorator extends TradeDecorator {

    public LoggingDecorator(Trade trade) {
        super(trade);
    }

    @Override
    public void process() {
        System.out.println("Writing Loggs.. Trade");
        wrappedTrade.process();
    }
}
