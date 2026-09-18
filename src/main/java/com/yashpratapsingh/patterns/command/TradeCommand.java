package com.yashpratapsingh.patterns.command;

public interface TradeCommand{
    void execute();
    void undo();
}
