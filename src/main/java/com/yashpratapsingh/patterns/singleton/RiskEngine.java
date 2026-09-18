package com.yashpratapsingh.patterns.singleton;

public class RiskEngine {

    private static volatile RiskEngine instance;
    private RiskEngine(){

    }



    public static RiskEngine getInstance(){
        if (instance == null){
            synchronized (RiskEngine.class){
                if(instance == null) instance = new RiskEngine();
            }
        }

        return instance;
    }


    public void checkRisk(){
        System.out.println("Checking Risk...");
    }
}
