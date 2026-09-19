package com.yashpratapsingh.patterns.proxy;

import com.yashpratapsingh.patterns.decorator.Trade;

import java.lang.reflect.Proxy;

public class TraderProfileFactory {

    public static TraderProfile getComplianceOfficerProxy(TraderProfile traderProfile){
        return (TraderProfile) Proxy.newProxyInstance(
                traderProfile.getClass().getClassLoader(),
                traderProfile.getClass().getInterfaces(),
                new ComplianceOfficerHandler(traderProfile)
        );
    }

    public static TraderProfile getRegularTraderProxy(TraderProfile traderProfile){
        return (TraderProfile) Proxy.newProxyInstance(
                traderProfile.getClass().getClassLoader(),
                traderProfile.getClass().getInterfaces(),
                new RegularTraderHandler(traderProfile)
        );
    }

}
