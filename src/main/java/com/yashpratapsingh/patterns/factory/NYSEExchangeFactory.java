package com.yashpratapsingh.patterns.factory;

public class NYSEExchangeFactory implements ExchangeFactory{

    @Override
    public FeeCalculator createFeeCalculator() {
        return new NYSEFee();
    }

    @Override
    public SettlementRule createSettlementRule() {
        return new NYSESettlement();
    }
}
