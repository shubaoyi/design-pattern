package com.byshu.factory.abstractfactory;

import com.byshu.visitor.Keyboard;
import com.byshu.visitor.Mouse;

/**
 * 产品族
 */
public abstract class AbstractFactory {

    abstract Mouse getMouse();

    abstract Keyboard getKeywboard();
}
