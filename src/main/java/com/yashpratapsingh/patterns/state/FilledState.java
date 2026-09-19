package com.yashpratapsingh.patterns.state;

public class FilledState implements State{

    OrderMachine orderMachine;

    public FilledState(OrderMachine orderMachine){
        this.orderMachine = orderMachine;
    }


    @Override
    public void allocateMargin() {
        System.out.println("Margin is already at the filled state");
    }

    @Override
    public void releaseMargin() {
        System.out.println("Can't release the margin from this state");
    }

    @Override
    public void submitOrder() {
        System.out.println("Already submitted");
    }

    @Override
    public void fillOrder() {
        System.out.println("Filling your order...");
        orderMachine.inventory--;
        if (orderMachine.getInventory() > 0){
            orderMachine.setState(orderMachine.getNoMarginState());
        }else orderMachine.setState(orderMachine.getOutOfInventoryState());
    }
}
