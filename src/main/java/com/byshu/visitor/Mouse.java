package com.byshu.visitor;

public class Mouse implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
