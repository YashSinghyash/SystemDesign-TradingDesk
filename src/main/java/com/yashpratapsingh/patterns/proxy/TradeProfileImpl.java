package com.yashpratapsingh.patterns.proxy;

public class TradeProfileImpl implements TraderProfile{

    private String name;
    private Double riskLimit , pnl;

    public TradeProfileImpl(String name, Double riskLimit, Double pnl) {
        this.name = name;
        this.riskLimit = riskLimit;
        this.pnl = pnl;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRiskLimit() {
        return riskLimit;
    }

    @Override
    public void setRiskLimit(double riskLimit) {
        this.riskLimit = riskLimit;
    }

    @Override
    public double getPnl() {
        return pnl;
    }

    @Override
    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
