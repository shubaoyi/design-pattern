package com.byshu.decorator;


public class LettuceHambuger extends AbstractHamburgerDecorator {

    public LettuceHambuger(Hambuger hambuger) {
        super(hambuger);
    }

    @Override
    public void make() {
        super.make();
        System.out.println("加生菜..");
    }

}
