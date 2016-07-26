package com.factorytest;

import android.util.Log;

/**
 * Created by Jason on 2016/7/26.
 */
public class SlowCar extends Car {

    @Override
    public void run() {
        Log.d("SlowCar", "It runs very slowly");
    }
}
