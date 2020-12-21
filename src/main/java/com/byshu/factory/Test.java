package com.byshu.factory;

import com.byshu.visitor.Mouse;

public class Test {

    public static void main(String[] args) {
        MouseFactory factory = new MouseFactory();
        Mouse dellMouse = factory.get("dell");
        Mouse hpMouse = factory.get("hp");
    }
}
