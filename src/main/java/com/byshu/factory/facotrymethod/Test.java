package com.byshu.factory.facotrymethod;

import com.byshu.visitor.Mouse;

public class Test {

    public static void main(String[] args) {
        AbstractFactory<Mouse> mouseFactory = new DellMouseFactory();
        AbstractFactory<Mouse> hpFactory = new HpMouseFactory();

        Mouse dellMouse = mouseFactory.get();
        Mouse hpMouse = hpFactory.get();
    }
}
