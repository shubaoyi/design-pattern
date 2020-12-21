package com.byshu.visitor;

public class Computer implements Visitable {

    Visitable[] parts;

    public Computer() {
        parts = new Visitable[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Visitable e : parts) {
            e.accept(visitor);
        }
        visitor.visit(this);
    }

}
