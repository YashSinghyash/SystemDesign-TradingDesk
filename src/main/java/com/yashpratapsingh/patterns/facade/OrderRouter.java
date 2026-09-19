package com.yashpratapsingh.patterns.facade;

public class OrderRouter {
    public void routeOrder(String symbol , int qty){
        System.out.println("Routing the order "+ symbol + " " + qty + "quantities");
    }
}
