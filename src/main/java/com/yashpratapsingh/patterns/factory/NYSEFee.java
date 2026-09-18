package com.yashpratapsingh.patterns.factory;

public class NYSEFee implements FeeCalculator{

    @Override
    public double calculateFee(double tradeValue) {
        return tradeValue * 0.001;
    }
}
