package com.yashpratapsingh.patterns.state;

public class OrderMachine {

    State noMarginState , filledState, outOfInventoryState , marginAllocatedState;
    State state;

    int inventory;
    public OrderMachine(int inventory) {
        this.noMarginState = new NoMarginState(this);
        this.filledState = new FilledState(this);
        this.outOfInventoryState = new OutOfInventoryState(this);
        this.marginAllocatedState = new MarginAllocatedState(this);

        this.inventory = inventory;
        state = (inventory > 0) ? noMarginState : outOfInventoryState;
    }

    public void allocateMargin(){
        state.allocateMargin();
    }
    public void releaseMargin(){
        state.releaseMargin();
    }
    public void submitOrder(){
        state.submitOrder();
        state.fillOrder();
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getInventory() {
        return inventory;
    }

    public State getNoMarginState() {
        return noMarginState;
    }

    public State getFilledState() {
        return filledState;
    }

    public State getOutOfInventoryState() {
        return outOfInventoryState;
    }

    public State getMarginAllocatedState() {
        return marginAllocatedState;
    }

    /*    private static int NO_MARGIN = 0 , MARGIN_ALLOCATED = 1, FILLED = 2 ,OUT_OF_INVENTORY = 3;
    int inventory ;

    public OrderMachine(int inventory) {
        this.inventory = inventory;
        state = (inventory >= 0) ? OUT_OF_INVENTORY : NO_MARGIN;
    }

    public void setState(State state) {
        this.state = state;
    }

    public static int getNoMargin() {
        return NO_MARGIN;
    }

    public static int getMarginAllocated() {
        return MARGIN_ALLOCATED;
    }

    public static int getFILLED() {
        return FILLED;
    }

    public static int getOutOfInventory() {
        return OUT_OF_INVENTORY;
    }

        public void allocateMargin(){
        if (state == NO_MARGIN){
            state = MARGIN_ALLOCATED;
            System.out.println("Margin Allocated successfully ");
        } else if (state == FILLED){
            System.out.println("margin filled already");
        } else if (state == MARGIN_ALLOCATED){
            System.out.println("Already allocated margin");
        }else if(state == OUT_OF_INVENTORY){
            System.out.println("Out of inventory for margins");
        }
    }

    public void releaseMargin(){
        if (state == NO_MARGIN){
            System.out.println("No margin to release");
        } else if (state == FILLED){
            System.out.println("Already filled the margin");
        } else if (state == MARGIN_ALLOCATED){
            System.out.println("Releasing margin");
            state = NO_MARGIN;
            System.out.println("Released");
        }else if(state == OUT_OF_INVENTORY){
            System.out.println("Out of inventory for margins");
        }
    }
    public void submitOrder(){
        if (state == MARGIN_ALLOCATED){
            System.out.println("Order submitted...");
            state = FILLED;
            fillOrder();
        } else if (state == NO_MARGIN){
            System.out.println("You need to allocate margin first");
        } else if (state == OUT_OF_INVENTORY){
            System.out.println("No inventory to submit against");
        } else if (state == FILLED){
            System.out.println("Order already submitted, please wait");
        }
    }
    public void fillOrder(){
        if (state == FILLED){
            inventory--;
            System.out.println("Order filled, shares delivered");
            if (inventory > 0){
                state = NO_MARGIN;
            } else {
                state = OUT_OF_INVENTORY;
                System.out.println("Out of inventory!");
            }
        } else if (state == NO_MARGIN){
            System.out.println("You need to allocate margin first");
        } else if (state == OUT_OF_INVENTORY){
            System.out.println("No order to fill, out of inventory");
        } else if (state == MARGIN_ALLOCATED){
            System.out.println("You need to submit the order first");
        }
    }*/


}
