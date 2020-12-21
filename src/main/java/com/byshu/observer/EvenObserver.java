package com.byshu.observer;

import java.util.Observable;
import java.util.Observer;

public class EvenObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o + ", count : " + arg);
    }

    public static void main(String[] args) {
        EvenObserver observer = new EvenObserver();
        Counter counter = new Counter();
        counter.addObserver(observer);
        counter.inrement();
    }

}
