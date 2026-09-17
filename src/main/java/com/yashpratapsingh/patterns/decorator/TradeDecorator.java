package com.yashpratapsingh.patterns.decorator;

public abstract class TradeDecorator implements Trade{
    protected Trade wrappedTrade;

    TradeDecorator(Trade trade){
        wrappedTrade = trade;
    }
}
