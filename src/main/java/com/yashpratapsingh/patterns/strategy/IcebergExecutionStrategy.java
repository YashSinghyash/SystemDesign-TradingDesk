package com.yashpratapsingh.patterns.strategy;

public class IcebergExecutionStrategy implements ExecutionStrategy{
    public boolean execute(Order order) {
        System.out.println("Executing " + order.getQuantity() + " shares of "
                + order.getSymbol() + " using IcebergES");
        return true;
    }
}
