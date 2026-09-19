package com.yashpratapsingh.patterns.facade;

public class RiskChecker {
    public void checkRisk(String symbol , int qty){
        System.out.println("Checking risk.... for trade of symbol " + symbol + " " + qty + " quantities");
    }
}
