package com.hwang.designpattern.factory.simplfactory;

public class BydCar implements Car {
    @Override
    public void create() {
        System.out.println("生产比亚迪汽车");
    }
}
