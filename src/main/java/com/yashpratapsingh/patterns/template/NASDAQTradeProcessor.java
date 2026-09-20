package com.yashpratapsingh.patterns.template;

public class NASDAQTradeProcessor extends TradeProcessor{

    @Override
    void routeOrder() {
        System.out.println("Routing order to NASDAQ!");
    }

    @Override
    void sendNotification() {
        System.out.println("Sending notification to NASDAQ");
    }

    @Override
    boolean requiresComplianceCheck(){
        return false;
    }

}
