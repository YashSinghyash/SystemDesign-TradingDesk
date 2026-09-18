package com.yashpratapsingh.patterns.command;

public class BasketCommand implements TradeCommand{

    TradeCommand[] tradeCommands;

    public BasketCommand(TradeCommand[] commands){
        this.tradeCommands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0 ; i < tradeCommands.length ; i++){
            tradeCommands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = tradeCommands.length -1 ; i >= 0 ; i--){
            tradeCommands[i].undo();
        }
    }
}
