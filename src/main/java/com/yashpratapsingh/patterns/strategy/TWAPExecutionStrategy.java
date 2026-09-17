package com.yashpratapsingh.patterns.strategy;

public class TWAPExecutionStrategy implements ExecutionStrategy {
    public boolean execute(Order order) {
        System.out.println("Executing " + order.getQuantity() + " shares of "
                + order.getSymbol() + " using TWAP (sliced over time)");
        return true;
    }
}
