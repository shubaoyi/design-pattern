package com.byshu.facade;


public class ModuleFacade {

    ModuleA moduleA = new ModuleA();
    ModuleB moduleB = new ModuleB();
    ModuleC moduleC = new ModuleC();

    public void a1() {
        moduleA.a1();
    }

    public void b1() {
        moduleB.b1();
    }

    public void c1() {
        moduleC.c1();
    }

    public static void main(String[] args) {
        ModuleFacade facade = new ModuleFacade();
        facade.a1();
        facade.b1();
        facade.c1();
    }

}
