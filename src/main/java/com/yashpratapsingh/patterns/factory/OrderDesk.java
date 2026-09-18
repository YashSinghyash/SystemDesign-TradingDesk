package com.yashpratapsingh.patterns.factory;

public abstract class OrderDesk {

    protected ExchangeFactory exchangeFactory;

    OrderDesk(ExchangeFactory exchangeFactory) {
        this.exchangeFactory = exchangeFactory;
    }

    abstract Order createOrder(String type);


    public void placeOrder(String type) {
        Order order = createOrder(type);
        order.execute();
        double fee = exchangeFactory.createFeeCalculator().calculateFee(1000);
        String settlementRule = exchangeFactory.createSettlementRule().getSettlementCycle();

        System.out.println("Fee: " + fee + "Settlement Rule: " + settlementRule);
    }

}