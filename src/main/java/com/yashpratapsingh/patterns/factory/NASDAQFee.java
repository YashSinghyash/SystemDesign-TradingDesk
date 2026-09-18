package com.yashpratapsingh.patterns.factory;

public class NASDAQFee implements FeeCalculator{
    @Override
    public double calculateFee(double tradeValue) {
        return tradeValue * 0.0012;
    }
}
