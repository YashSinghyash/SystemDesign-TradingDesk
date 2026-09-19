package com.yashpratapsingh.patterns.state;

public interface State {
    void allocateMargin();
    void releaseMargin();
    void submitOrder();
    void fillOrder();
}
