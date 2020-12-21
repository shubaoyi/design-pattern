package com.byshu.factory.abstractfactory;

import com.byshu.factory.HpKeyboard;
import com.byshu.factory.HpMouse;
import com.byshu.visitor.Keyboard;
import com.byshu.visitor.Mouse;

public class HpFactory extends AbstractFactory {

    @Override
    Mouse getMouse() {
        return new HpMouse();
    }

    @Override
    Keyboard getKeywboard() {
        return new HpKeyboard();
    }

}
