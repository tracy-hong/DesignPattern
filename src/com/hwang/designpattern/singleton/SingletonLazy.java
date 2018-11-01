package com.hwang.designpattern.singleton;

/**
 *  单例模式-懒汉模式（线程安全的，加载效率低，因为要加同步锁）
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){

    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}
