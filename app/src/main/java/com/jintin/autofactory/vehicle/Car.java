package com.jintin.autofactory.vehicle;

import com.jintin.autofactory.AutoElement;

@AutoElement(VehicleTags.CAR)
public class Car implements Vehicle{
    @Override
    public void getModel() {
        System.out.println("I am a car");
    }
}
