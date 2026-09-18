package com.yashpratapsingh.patterns.factory;

public class NASDAQLimitOrder implements Order{
    @Override
    public void execute() {
        System.out.println("Executing from NASDAQ (LIMIT ORDER)");
    }
}
