package com.yashpratapsingh.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RegularTraderHandler implements InvocationHandler {

    TraderProfile traderProfile;

    public RegularTraderHandler(TraderProfile traderProfile){
        this.traderProfile = traderProfile;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("set")){
            throw new IllegalAccessException("Regular traders cannot modify risk limits");
        }else{
            return method.invoke(traderProfile , args);
        }
    }
}
