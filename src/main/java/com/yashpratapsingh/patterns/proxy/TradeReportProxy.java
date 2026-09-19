package com.yashpratapsingh.patterns.proxy;

public class TradeReportProxy implements TradeReport{

    private RealTradeReport realTradeReport;
    private String symbol;
    public TradeReportProxy(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display(){
        if (realTradeReport == null){
            System.out.println("Loading for please wait");
            try{
                realTradeReport = new RealTradeReport(symbol);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        realTradeReport.display();

    }
}
