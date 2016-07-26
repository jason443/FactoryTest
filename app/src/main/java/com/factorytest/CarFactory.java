package com.factorytest;

/**
 * Created by Jason on 2016/7/26.
 */
public class CarFactory {

    public static final int FAST = 0;
    public static final int SLOW = 1;

    public static Car createCar(int carName) {
        switch(carName) {
            case FAST:
                return new FastCar();
            case SLOW:
                return new SlowCar();
            default:
                return null;
        }
    }

}
