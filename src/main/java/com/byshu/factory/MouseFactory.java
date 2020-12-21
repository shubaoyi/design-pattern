package com.byshu.factory;

import com.byshu.visitor.Mouse;

public class MouseFactory {

    Mouse get(String type) {
        if ("dell".equals(type)) {
            return new DellMouse();
        } else if ("hp".equals(type)) {
            return new HpMouse();
        }
        return null;
    }

}
