package com.yashpratapsingh.patterns.state;
public class NoMarginState implements State{

    OrderMachine orderMachine;

    public NoMarginState(OrderMachine orderMachine){
        this.orderMachine = orderMachine;
    }

    @Override
    public void allocateMargin() {
        System.out.println("Margin allocated");
        orderMachine.setState(orderMachine.getMarginAllocatedState());
    }

    @Override
    public void releaseMargin() {
        System.out.println("You have not allocated any margin");
    }

    @Override
    public void submitOrder() {
        System.out.println("You neeed to allocate margin first");
    }

    @Override
    public void fillOrder() {
        System.out.println("You need to allocate margin first");
    }
}
