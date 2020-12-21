package com.byshu.observer;


import java.util.Observable;

public class Counter extends Observable {

    int count;

    public void inrement() {
        while (count < 1000) {
            if (count % 2 == 0) {
                setChanged();
                notifyObservers(count);
            }
            count++;
        }
    }
}
