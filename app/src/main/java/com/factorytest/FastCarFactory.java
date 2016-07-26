package com.factorytest;

/**
 * Created by Jason on 2016/7/26.
 */
public class FastCarFactory implements ICarFactory {

    @Override
    public Car createCar() {
        return new FastCar();
    }

    @Override
    public Driver createDriver() {
        return new FastCarDriver();
    }
}
