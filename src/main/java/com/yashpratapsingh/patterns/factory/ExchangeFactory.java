package com.yashpratapsingh.patterns.factory;

public interface ExchangeFactory {
    FeeCalculator createFeeCalculator();
    SettlementRule createSettlementRule();
}
