package com.yashpratapsingh.patterns.iterator;

public class NASDAQPortfolioIterator implements Iterator{

    Holding[] holdings;
    int position = 0;

    public NASDAQPortfolioIterator(Holding[] holding) {
        this.holdings = holding;
    }

    @Override
    public boolean hasNext() {
        return position < holdings.length && holdings[position] != null;
    }

    @Override
    public Object next() {
        return holdings[position++];
    }
}
