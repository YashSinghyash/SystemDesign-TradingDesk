package com.yashpratapsingh.patterns.command;

public class SellCommand implements TradeCommand{
    private TradingAccount tradingAccount;
    private String symbol ;
    private int quantity;

    public SellCommand(TradingAccount tradingAccount , String symbol , int quantity){
        this.symbol = symbol;
        this.quantity = quantity;
        this.tradingAccount = tradingAccount;
    }

    @Override
    public void execute() {
        tradingAccount.sell(symbol , quantity);
    }

    @Override
    public void undo() {
        tradingAccount.buy(symbol , quantity);
    }
}
