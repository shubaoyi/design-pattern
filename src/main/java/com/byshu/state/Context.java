package com.byshu.state;

public class Context {

    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction();
    }

}
