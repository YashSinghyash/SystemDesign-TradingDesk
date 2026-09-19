package com.yashpratapsingh.patterns.facade;

public class TradeDeskFacade {
    private RiskChecker riskChecker;
    private ComplianceLogger complianceLogger;
    private OrderRouter orderRouter;
    private SettlementSystem settlementSystem;
    private NotificationService notificationService;
    
    public TradeDeskFacade(RiskChecker riskChecker , ComplianceLogger complianceLogger , OrderRouter orderRouter
                           , NotificationService notificationService , SettlementSystem settlementSystem){
        
        this.riskChecker = riskChecker;
        this.complianceLogger = complianceLogger;
        this.orderRouter = orderRouter;
        this.settlementSystem = settlementSystem;
        this.notificationService = notificationService;
    }
    
    public void placeTrade(String symbol, int qty){
        riskChecker.checkRisk(symbol , qty);
        orderRouter.routeOrder(symbol , qty);
        complianceLogger.logTrade(symbol , qty);
        settlementSystem.settleTrade(symbol , qty);
        notificationService.notifyUser(symbol , qty);
    }
    
}
