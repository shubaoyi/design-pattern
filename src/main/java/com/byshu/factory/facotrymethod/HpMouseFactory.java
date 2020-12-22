package com.byshu.factory.facotrymethod;

import com.byshu.factory.HpMouse;
import com.byshu.visitor.Mouse;

public class HpMouseFactory extends AbstractFactory<Mouse> {

    @Override
    Mouse get() {
        return new HpMouse();
    }

}
