package com.hwang.designpattern.factory.simplfactory;

public class CarFactorySimple {
    public static Car createAudiCar() {
        return new AudiCar();
    }

    public static Car createBydCar() {
        return new BydCar();
    }
}
