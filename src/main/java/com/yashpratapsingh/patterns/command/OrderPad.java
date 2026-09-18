package com.yashpratapsingh.patterns.command;

public class OrderPad {

    private TradeCommand[] slots = new TradeCommand[5];
    private TradeCommand lastCommand;

    public OrderPad(){
        for (int i = 0 ; i < slots.length; i++){
            slots[i] = new NoCommand();
        }
    }
    public void setCommand(int slotIndex , TradeCommand command){
        slots[slotIndex] = command;
    }

    public void buttonWasPressed(int slotIndex){
        slots[slotIndex].execute();
        lastCommand = slots[slotIndex];
    }

    public void undoButtonWasPressed(){
        lastCommand.undo();
    }
}
