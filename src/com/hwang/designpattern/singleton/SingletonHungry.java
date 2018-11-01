package com.hwang.designpattern.singleton;

/**
 *  单例模式-饿汉式（线程安全，效率高，因为在类加载时对对象进行初始化，所以叫做饿汉式，饿的等不及）
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){

    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
