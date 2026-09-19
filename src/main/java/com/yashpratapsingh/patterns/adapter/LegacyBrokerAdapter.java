package com.yashpratapsingh.patterns.adapter;

import com.yashpratapsingh.patterns.command.TradeCommand;

public class LegacyBrokerAdapter implements TradeCommand {
    LegacyBrokerAPI legacyBroker;

    public LegacyBrokerAdapter(LegacyBrokerAPI legacyBroker){
        this.legacyBroker = legacyBroker;
    }

    @Override
    public void execute() {
        legacyBroker.submitOrder();
    }

    @Override
    public void undo() {
        legacyBroker.cancelOrder();
    }
}
