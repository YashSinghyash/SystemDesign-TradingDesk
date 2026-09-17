package com.yashpratapsingh.patterns.strategy;

public class OrderExecutor {
    private ExecutionStrategy strategy;

    public void setStrategy(ExecutionStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeOrder(Order order) {
        strategy.execute(order);
    }

}
