package com.byshu.factory.facotrymethod;

import com.byshu.visitor.Mouse;

public class Test {

    public static void main(String[] args) {
        AbstractMouseFactory<Mouse> mouseFactory = new DellMouseFactory();
        AbstractMouseFactory<Mouse> hpFactory = new HpMouseFactory();

        Mouse dellMouse = mouseFactory.get();
        Mouse hpMouse = hpFactory.get();
    }
}
