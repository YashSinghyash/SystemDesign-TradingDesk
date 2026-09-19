package com.yashpratapsingh.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ComplianceOfficerHandler implements InvocationHandler {

    TraderProfile traderProfile;

    public ComplianceOfficerHandler(TraderProfile traderProfile){
        this.traderProfile = traderProfile;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(traderProfile, args);
    }
}