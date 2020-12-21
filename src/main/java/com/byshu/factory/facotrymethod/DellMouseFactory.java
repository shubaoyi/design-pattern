package com.byshu.factory.facotrymethod;

import com.byshu.factory.DellMouse;
import com.byshu.visitor.Mouse;

public class DellMouseFactory extends AbstractMouseFactory<Mouse> {

    @Override
    Mouse get() {
        return new DellMouse();
    }
}
