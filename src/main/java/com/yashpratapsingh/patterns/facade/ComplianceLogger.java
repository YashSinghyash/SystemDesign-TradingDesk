package com.yashpratapsingh.patterns.facade;

public class ComplianceLogger {
    public void logTrade(String symbol , int qty){
        System.out.println("Logging trade of symbol: " + symbol  + " " + qty + " quantities");
    }
}
