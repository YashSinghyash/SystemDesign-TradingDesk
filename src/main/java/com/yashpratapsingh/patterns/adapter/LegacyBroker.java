package com.yashpratapsingh.patterns.adapter;

public class LegacyBroker implements LegacyBrokerAPI{
    @Override
    public void submitOrder() {
        System.out.println("Legacy broker : order submitted");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Legacy broker : order cancelled");
    }
}
