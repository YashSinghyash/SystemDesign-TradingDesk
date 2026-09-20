package com.yashpratapsingh.patterns.composite;

public abstract class PortfolioComponent {
    public void add(PortfolioComponent component){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
