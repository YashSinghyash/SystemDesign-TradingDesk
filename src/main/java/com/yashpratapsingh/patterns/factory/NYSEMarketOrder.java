package com.yashpratapsingh.patterns.factory;

public class NYSEMarketOrder implements Order{
    public void execute(){
        System.out.println("Executing NYSE Market Order...");
    }
}
