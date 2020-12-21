package com.byshu.factory.abstractfactory;

import com.byshu.visitor.Keyboard;
import com.byshu.visitor.Mouse;

public class Test {

    public static void main(String[] args) {
        AbstractFactory dellFactory = new DellFactory();
        AbstractFactory hpFactory = new HpFactory();

        Mouse dellMouse = dellFactory.getMouse();
        Keyboard dellKboard = dellFactory.getKeywboard();

        Mouse hpMouse = hpFactory.getMouse();
        Keyboard hpKboard = hpFactory.getKeywboard();
    }
}
