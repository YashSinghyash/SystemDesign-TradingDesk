package com.yashpratapsingh.patterns.decorator;

public class CommissionDecorator extends TradeDecorator {

    public CommissionDecorator(Trade trade) {
        super(trade);
    }

    @Override
    public void process() {
        System.out.println("Comms... Trade");
        wrappedTrade.process();
    }
}
