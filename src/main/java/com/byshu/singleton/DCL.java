package com.byshu.singleton;


public class DCL {

    // 借助volatile禁止指令重排序
    private static volatile DCL instance;


    public static DCL getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    /**
                     * 创建对象的一般过程
                     * 为对象分配内存 -> 初始化 -> 栈中压入引用指向对象
                     * 但第2, 3步可能被交换顺序
                     */
                    instance = new DCL();
                }
            }
        }
        return instance;
    }

}
