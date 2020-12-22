package com.byshu.state;

public class StartState implements State {

    @Override
    public void doAction() {
        System.out.println("do something in start state..");
    }

}
