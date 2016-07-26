package com.factorytest;

import android.util.Log;

/**
 * Created by Jason on 2016/7/26.
 */
public class FastCarDriver implements Driver {

    @Override
    public void driveCar() {
        Log.d("FastCarDriver", "fast!");
    }
}
