package com.hwang.designpattern.singleton;

/**
 * 单例模式-静态内部类模式
 */

public class SingletonStatic {

    private static class SingletonStaticClass {
        private static final SingletonStatic instance = new SingletonStatic();
    }

    private SingletonStatic() {

    }

    public static SingletonStatic getInstance() {
        return SingletonStaticClass.instance;
    }
}
