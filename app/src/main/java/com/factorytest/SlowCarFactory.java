package com.factorytest;

/**
 * Created by Jason on 2016/7/26.
 */
public class SlowCarFactory implements ICarFactory {

    @Override
    public Car createCar() {
        return new SlowCar();
    }

    @Override
    public Driver createDriver() {
        return new SlowCarDriver();
    }
}
