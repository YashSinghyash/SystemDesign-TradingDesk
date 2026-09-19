package com.yashpratapsingh.patterns.facade;

public class NotificationService {
    public void notifyUser(String symbol , int qty){
        System.out.println("Notifying user of " + symbol + qty + " quantities");
    }
}
