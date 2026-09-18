package com.yashpratapsingh.patterns.factory;

public class NYSESettlement implements SettlementRule {
    @Override
    public String getSettlementCycle() {
        return "T+1";
    }
}
