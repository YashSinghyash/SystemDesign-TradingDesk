package com.yashpratapsingh.patterns.proxy;

public interface TraderProfile {
    String getName();
    double getRiskLimit();
    void setRiskLimit(double riskLimit);
    double getPnl();
    void setPnl(double pnl);
}
