package com.hwang.designpattern.factory.factorymethod;

public class FactoryClient {
    public static void main(String[] args) {
       Car car = new AudiFactory().crateCar();
       Car car1 = new BydFactory().crateCar();

       car.create();
       car1.create();
    }
}
