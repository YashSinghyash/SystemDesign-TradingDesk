package com.yashpratapsingh.patterns.state;

public class OutOfInventoryState implements State{

    OrderMachine orderMachine;

    public OutOfInventoryState(OrderMachine orderMachine){
        this.orderMachine = orderMachine;
    }

    @Override
    public void allocateMargin() {
        System.out.println("out of inventory");
    }

    @Override
    public void releaseMargin() {
        System.out.println("out of inventory nothing to release");
    }

    @Override
    public void submitOrder() {
        System.out.println("Nothing to submit");
    }

    @Override
    public void fillOrder() {
        System.out.println("No order to fill");
    }
}
