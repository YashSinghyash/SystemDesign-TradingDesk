package com.yashpratapsingh.patterns.command;

public class BuyCommand implements TradeCommand{
    private TradingAccount tradingAccount;
    private String symbol ;
    private int quantity;

    public BuyCommand(TradingAccount tradingAccount , String symbol , int quantity){
        this.symbol = symbol;
        this.quantity = quantity;
        this.tradingAccount = tradingAccount;
    }

    @Override
    public void execute() {
        tradingAccount.buy(symbol , quantity);
    }

    @Override
    public void undo() {
        tradingAccount.sell(symbol , quantity);
    }
}
