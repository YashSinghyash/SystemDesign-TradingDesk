package com.yashpratapsingh.patterns;

import com.yashpratapsingh.patterns.observer.DashboardDisplay;
import com.yashpratapsingh.patterns.observer.PriceTicker;
import com.yashpratapsingh.patterns.observer.RiskMonitorDisplay;
import com.yashpratapsingh.patterns.observer.TradingAlgoDisplay;
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


        PriceTicker priceTicker = new PriceTicker();
        RiskMonitorDisplay riskMonitorDisplay = new RiskMonitorDisplay();
        TradingAlgoDisplay tradingAlgoDisplay = new TradingAlgoDisplay();
        DashboardDisplay dashboardDisplay = new DashboardDisplay();

        priceTicker.subscribe(riskMonitorDisplay);
        priceTicker.subscribe(tradingAlgoDisplay);
        priceTicker.subscribe(dashboardDisplay);

        priceTicker.setPrice("RLNCE"  , 45);
        priceTicker.unsubscribe(riskMonitorDisplay);

        priceTicker.setPrice("WPRO"  , 404.23);
    }
}
