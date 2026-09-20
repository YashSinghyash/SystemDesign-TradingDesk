package com.yashpratapsingh.patterns.template;

public class NYSETradeProcessor extends TradeProcessor{



    @Override
    void routeOrder() {
        System.out.println("Routing Order to NYSE");
    }

    @Override
    void sendNotification() {
        System.out.println("Notifying via NYSE gateway");
    }
}
