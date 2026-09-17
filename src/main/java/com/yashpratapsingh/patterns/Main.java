package com.yashpratapsingh.patterns;

import com.yashpratapsingh.patterns.strategy.*;

import static com.yashpratapsingh.patterns.strategy.Order.Side.*;

public class Main {
    public static void main(String[]args){
        Order order = new Order("RELIANCE ", 12 , 124.50 ,  BUY );

        OrderExecutor executor = new OrderExecutor();

        ExecutionStrategy twapStrategy = new TWAPExecutionStrategy();
        ExecutionStrategy icebergStrategy = new IcebergExecutionStrategy();

        executor.setStrategy(twapStrategy);
        executor.executeOrder(order);

        executor.setStrategy(icebergStrategy);
        executor.executeOrder(order);
    }
}
