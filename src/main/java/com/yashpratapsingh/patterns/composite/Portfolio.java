package com.yashpratapsingh.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Portfolio extends PortfolioComponent{
    private String name;
    List<PortfolioComponent> children = new ArrayList<>();

    public Portfolio(String name) {
        this.name = name;
    }

    @Override
    public void add(PortfolioComponent component){
        children.add(component);
    }

    @Override
    public void print(){
        System.out.println(name);
        for (PortfolioComponent c: children){
            c.print();
        }
    }
}
