package com.hwang.designpattern.factory.factorymethod;

public class AudiCar implements Car {
    @Override
    public void create() {
        System.out.println("生产奥迪汽车");
    }
}
