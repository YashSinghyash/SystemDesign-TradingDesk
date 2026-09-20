package com.yashpratapsingh.patterns.builder;

public class TradeOrder {

    private final String symbol;
    private final int quantity;
    private final double stopLoss;
    private final double takeProfit;
    private final String timeInForce;
    private final int icebergQty;

    private TradeOrder(Builder builder){
        this.symbol = builder.symbol;
        this.quantity = builder.quantity;
        this.stopLoss = builder.stopLoss;
        this.takeProfit = builder.takeProfit;
        this.timeInForce = builder.timeInForce;
        this.icebergQty = builder.icebergQty;
    }


    public static class Builder{
        private final String symbol;
        private final int quantity;
        private double stopLoss;
        private double takeProfit;
        private String timeInForce = "DAY";
        private int icebergQty = 0;


        public Builder(String symbol , int quantity){
            this.symbol = symbol;
            this.quantity = quantity;
        }

        public Builder stopLoss(double stopLoss){this.stopLoss = stopLoss; return this;}
        public Builder takeProfit(double takeProfit) {this.takeProfit = takeProfit ; return this; }
        public Builder timeInForce(String timeInForce){this.timeInForce = timeInForce ; return this; }
        public Builder icebergQty(int icebergQty) {this.icebergQty = icebergQty ; return this;}

        public TradeOrder build(){
            return new TradeOrder(this);
        }
    }

    @Override
    public String toString() {
        return "TradeOrder{" +
                "symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", stopLoss=" + stopLoss +
                ", takeProfit=" + takeProfit +
                ", timeInForce='" + timeInForce + '\'' +
                ", icebergQty=" + icebergQty +
                '}';
    }
}





//    private int quanity , icebergQty;
//    private String symbol , timeInForce;
//    private double stopLoss , takeProfit;
//
//    public TradeOrder(int quanity, int icebergQty, String symbol, String timeInForce, double stopLoss, double takeProfit) {
//        this.quanity = quanity;
//        this.icebergQty = icebergQty;
//        this.symbol = symbol;
//        this.timeInForce = timeInForce;
//        this.stopLoss = stopLoss;
//        this.takeProfit = takeProfit;
//    }


