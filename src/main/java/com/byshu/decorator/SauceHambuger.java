package com.byshu.decorator;


public class SauceHambuger extends AbstractHamburgerDecorator {

    public SauceHambuger(Hambuger hambuger) {
        super(hambuger);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("加番茄酱..");
    }

}
