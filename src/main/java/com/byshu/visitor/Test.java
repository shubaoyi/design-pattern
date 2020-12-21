package com.byshu.visitor;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerVisitor visitor = new ComputerVisitor();
        computer.accept(visitor);
    }

}
