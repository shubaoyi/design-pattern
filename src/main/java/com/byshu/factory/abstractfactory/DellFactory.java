package com.byshu.factory.abstractfactory;

import com.byshu.factory.DellKeyboard;
import com.byshu.factory.DellMouse;
import com.byshu.visitor.Keyboard;
import com.byshu.visitor.Mouse;

public class DellFactory extends AbstractFactory {

    @Override
    Mouse getMouse() {
        return new DellMouse();
    }

    @Override
    Keyboard getKeywboard() {
        return new DellKeyboard();
    }

}
