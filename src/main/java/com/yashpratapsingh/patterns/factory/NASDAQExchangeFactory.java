package com.yashpratapsingh.patterns.factory;

public class NASDAQExchangeFactory implements ExchangeFactory{
    @Override
    public FeeCalculator createFeeCalculator() {
        return new NASDAQFee();
    }

    @Override
    public SettlementRule createSettlementRule() {
        return new NASDAQSettlement();
    }
}
