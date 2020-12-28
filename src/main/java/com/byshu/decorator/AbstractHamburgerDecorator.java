package com.byshu.decorator;


public abstract class AbstractHamburgerDecorator extends Hambuger {

    Hambuger hambuger;

    public AbstractHamburgerDecorator(Hambuger hambuger) {
        this.hambuger = hambuger;
    }

    @Override
    public void make() {
        hambuger.make();
    }

}
