package com.byshu.decorator;

public class Test {

    public static void main(String[] args) {
        LettuceHambuger lettuceHambuger = new LettuceHambuger(new Hambuger());
        SausageHambuger sausageHambuger = new SausageHambuger(lettuceHambuger);
        SauceHambuger sauceHambuger = new SauceHambuger(sausageHambuger);
        sauceHambuger.make();
    }

}
