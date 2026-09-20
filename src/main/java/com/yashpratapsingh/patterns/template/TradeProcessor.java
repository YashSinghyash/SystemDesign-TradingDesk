package com.yashpratapsingh.patterns.template;

public abstract class TradeProcessor {

    public final void processTrade(){
        validateOrder();
        routeOrder();
        confirmTrade();
        if(requiresComplianceCheck()) runComplianceCheck();
        sendNotification();
    }


    void validateOrder(){
        System.out.println("Validating order");
    }

    boolean requiresComplianceCheck(){
        return true;
    }

    void confirmTrade(){
        System.out.println("Trade Confirmed");
    }

    void runComplianceCheck(){
        System.out.println("Running compliance check");
    }

    abstract void routeOrder();
    abstract void sendNotification();
}
