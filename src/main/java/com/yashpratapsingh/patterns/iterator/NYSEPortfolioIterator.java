package com.yashpratapsingh.patterns.iterator;

import java.util.List;

public class NYSEPortfolioIterator implements Iterator{

    List<Holding> holdings;
    int position = 0;

    public NYSEPortfolioIterator(List<Holding> holdings){
        this.holdings = holdings;
    }

    @Override
    public boolean hasNext() {
        return position < holdings.size();
    }

    @Override
    public Object next() {
        return holdings.get(position++);
    }
}
