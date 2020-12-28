package com.byshu.strategy;

public class SumOperation implements Strategy {

    @Override
    public int compute(int num1, int num2) {
        return num1 + num2;
    }

}
