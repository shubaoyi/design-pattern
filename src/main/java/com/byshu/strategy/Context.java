package com.byshu.strategy;


public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int compute(int num1, int num2) {
        return strategy.compute(num1, num2);
    }

    public static void main(String[] args) {
        Context context = new Context(new SumOperation());
        System.out.println(context.compute(1, 2));

        context.setStrategy(new SubtractOperation());
        System.out.println(context.compute(1, 2));

        context.setStrategy(new MultiplyOperation());
        System.out.println(context.compute(1, 2));
    }

}
