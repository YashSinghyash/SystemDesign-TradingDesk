package com.yashpratapsingh.patterns;

import com.yashpratapsingh.patterns.command.*;
import com.yashpratapsingh.patterns.decorator.*;
import com.yashpratapsingh.patterns.factory.NASDAQOrderDesk;
import com.yashpratapsingh.patterns.factory.NYSEOrderDesk;
import com.yashpratapsingh.patterns.factory.OrderDesk;
import com.yashpratapsingh.patterns.observer.DashboardDisplay;
import com.yashpratapsingh.patterns.observer.PriceTicker;
import com.yashpratapsingh.patterns.observer.RiskMonitorDisplay;
import com.yashpratapsingh.patterns.observer.TradingAlgoDisplay;
import com.yashpratapsingh.patterns.singleton.RiskEngine;
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

        Trade trade1 = new RiskCheckDecorator(new LoggingDecorator(new CommissionDecorator(new BaseTrade())));
        trade1.process();

        Trade trade2 = new RiskCheckDecorator(new CommissionDecorator(new BaseTrade()));
        trade2.process();

        OrderDesk orderDesk = new NYSEOrderDesk();
        orderDesk.placeOrder("MarketOrder");

        OrderDesk orderDesk1 = new NASDAQOrderDesk();
        orderDesk1.placeOrder("LIMIT");

        RiskEngine riskEngine1 = RiskEngine.getInstance();
        RiskEngine riskEngine2 = RiskEngine.getInstance();

        System.out.println(riskEngine2 == riskEngine1);

        TradingAccount tradingAccount = new TradingAccount();
        BuyCommand buyReliance = new BuyCommand(tradingAccount , "RELIANCE" ,  12);

        OrderPad orderPad = new OrderPad();
        orderPad.setCommand(0, buyReliance);


        TradeCommand buyReliance2 = new BuyCommand(tradingAccount , "RELIANCE" , 5);
        TradeCommand sellWipro = new SellCommand(tradingAccount , "WIPRO" , 12);

        TradeCommand[] rebalanceBasket = {buyReliance , buyReliance2 , sellWipro};
        BasketCommand basketCommand = new BasketCommand(rebalanceBasket);

        orderPad.setCommand(1, basketCommand);
        System.out.println("");
        System.out.println("");
        System.out.println("Starting command");
        orderPad.buttonWasPressed(0);
        orderPad.undoButtonWasPressed();
        orderPad.buttonWasPressed(1);

        System.out.println("");
        System.out.println("");

        orderPad.undoButtonWasPressed();



    }
}
