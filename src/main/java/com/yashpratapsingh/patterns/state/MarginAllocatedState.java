package com.yashpratapsingh.patterns.state;

public class MarginAllocatedState implements State{

    OrderMachine orderMachine;

    public MarginAllocatedState(OrderMachine orderMachine){
        this.orderMachine = orderMachine;
    }

    @Override
    public void allocateMargin() {
        System.out.println("Already allocated the margin");
    }

    @Override
    public void releaseMargin() {
        System.out.println("Releasing the margin");
        orderMachine.setState(orderMachine.getNoMarginState());
    }

    @Override
    public void submitOrder() {
        System.out.println("Submitting the margin...");
        orderMachine.setState(orderMachine.getFilledState());
    }

    @Override
    public void fillOrder() {
        System.out.println("First you should submit the order");
    }
}
