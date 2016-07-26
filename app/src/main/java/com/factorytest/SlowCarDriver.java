package com.factorytest;

import android.util.Log;

/**
 * Created by Jason on 2016/7/26.
 */
public class SlowCarDriver implements Driver {

    @Override
    public void driveCar() {
        Log.d("SolwCarDriver", "safe");
    }
}
