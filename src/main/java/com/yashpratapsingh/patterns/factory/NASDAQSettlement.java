package com.yashpratapsingh.patterns.factory;

public class NASDAQSettlement implements SettlementRule{
    @Override
    public String getSettlementCycle() {
        return "T+2";
    }
}
