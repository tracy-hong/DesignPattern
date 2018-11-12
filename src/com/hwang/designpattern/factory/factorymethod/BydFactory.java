package com.hwang.designpattern.factory.factorymethod;

public class BydFactory implements CarFactoryMethod {
    @Override
    public Car crateCar() {
        return new BydCar();
    }
}
