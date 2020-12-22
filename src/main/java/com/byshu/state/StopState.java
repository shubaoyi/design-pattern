package com.byshu.state;

public class StopState implements State {

    @Override
    public void doAction() {
        System.out.println("do something in stop state..");
    }

}
