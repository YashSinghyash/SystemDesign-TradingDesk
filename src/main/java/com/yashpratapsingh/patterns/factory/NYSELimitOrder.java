package com.yashpratapsingh.patterns.factory;

public class NYSELimitOrder implements Order{
    public void execute(){
        System.out.println("Executing NYSE Limit Order...");
    }
}
