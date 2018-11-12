package com.hwang.designpattern.factory.factorymethod;

public class AudiFactory implements CarFactoryMethod {
    @Override
    public Car crateCar() {
        return new AudiCar();
    }
}
