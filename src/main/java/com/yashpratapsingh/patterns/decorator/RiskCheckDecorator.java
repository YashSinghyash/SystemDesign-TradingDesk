package com.yashpratapsingh.patterns.decorator;

public class RiskCheckDecorator extends TradeDecorator {

    public RiskCheckDecorator(Trade trade) {
        super(trade);
    }

    @Override
    public void process() {
        System.out.println("Risk Check.. Trade");
        wrappedTrade.process();
    }
}
