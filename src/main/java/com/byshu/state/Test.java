package com.byshu.state;

public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StartState());
        context.doAction();

        context.setState(new StopState());
        context.doAction();
    }

}
