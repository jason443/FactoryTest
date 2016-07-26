package com.factorytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final int FAST = 0;
    public static final int SLOW = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   /*     Car fastCar = CarFactory.createCar(FAST);
        if(fastCar != null) {
            fastCar.run();
        }

        Car slowCar = CarFactory.createCar(SLOW);
        if(slowCar != null) {
            slowCar.run();
        }
    */

        ICarFactory fastCarFactory = new FastCarFactory();
        Car fastCar = fastCarFactory.createCar();
        Driver fastCarDriver = fastCarFactory.createDriver();
        fastCar.run();
        fastCarDriver.driveCar();

        ICarFactory slowCarFactory = new SlowCarFactory();
        Car slowCar = slowCarFactory.createCar();
        Driver slowCarDriver = slowCarFactory.createDriver();
        slowCar.run();
        slowCarDriver.driveCar();

    }
}
