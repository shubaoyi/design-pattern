package com.byshu.visitor;

public class Keyboard implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
