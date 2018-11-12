package com.hwang.designpattern.factory.simplfactory;

public class FactoryClient1 {
    public static void main(String[] args) {
        AudiCar audiCar = new AudiCar();
        BydCar bydCar = new BydCar();

        audiCar.create();
        bydCar.create();
    }
}
